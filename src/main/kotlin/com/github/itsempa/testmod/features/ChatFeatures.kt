package com.github.itsempa.testmod.features

import com.github.itsempa.testmod.ExampleMod
import com.github.itsempa.testmod.utils.ChatUtils
import net.minecraftforge.client.event.ClientChatReceivedEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent

class ChatFeatures {

    @SubscribeEvent(receiveCanceled = true)
    fun onChatReceive(event: ClientChatReceivedEvent) {
        if (event.type.toInt() == 2) return

        val message = event.message.formattedText
        if (ExampleMod.config.secondCategory.chat.duplicateChatMessage) {
            ChatUtils.messageToChat(message)
        }
    }
}
