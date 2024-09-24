package com.github.itsempa.testmod.utils

import net.minecraft.client.Minecraft
import net.minecraft.util.ChatComponentText

object ChatUtils {

    fun messageToChat(message: String) {
        Minecraft.getMinecraft().thePlayer.addChatMessage(ChatComponentText(message))
    }
}