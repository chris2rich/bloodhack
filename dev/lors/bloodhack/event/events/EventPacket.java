package dev.lors.bloodhack.event.events;

import dev.lors.bloodhack.event.EventCancellable;
import net.minecraft.network.Packet;

public class EventPacket extends EventCancellable {
   private final Packet packet;

   public EventPacket(Packet packet) {
      this.packet = packet;
   }

   public Packet get_packet() {
      return this.packet;
   }

   public static class SendPacket extends EventPacket {
      public SendPacket(Packet packet) {
         super(packet);
      }
   }

   public static class ReceivePacket extends EventPacket {
      public ReceivePacket(Packet packet) {
         super(packet);
      }
   }
}
