package net.mcreator.cubicfruits.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;

import net.mcreator.cubicfruits.CubicFruitsMod;

@EventBusSubscriber
public record Ability1KeyMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<Ability1KeyMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(CubicFruitsMod.MODID, "key_ability_1_key"));
	public static final StreamCodec<RegistryFriendlyByteBuf, Ability1KeyMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, Ability1KeyMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new Ability1KeyMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<Ability1KeyMessage> type() {
		return TYPE;
	}

	public static void handleData(final Ability1KeyMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CubicFruitsMod.addNetworkMessage(Ability1KeyMessage.TYPE, Ability1KeyMessage.STREAM_CODEC, Ability1KeyMessage::handleData);
	}
}