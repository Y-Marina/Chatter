package com.marina.chatter.model

data class Message(
    val id: String = "",
    val senderId: String = "",
    val receiverId: String = "",
    val message: String = "",
    val createAt: Long = System.currentTimeMillis(),
    val senderName: String = "",
    val senderImage: String? = null,
    val imageUrl: String? = null
)
