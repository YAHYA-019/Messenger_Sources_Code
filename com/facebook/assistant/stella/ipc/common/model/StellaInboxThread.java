package com.facebook.assistant.stella.ipc.common.model;

/* loaded from: StellaInboxThread.class */
public class StellaInboxThread {
    public boolean isE2ee;
    public boolean isGroup;
    public boolean isMuted;
    public StellaInboxMessage[] messageList = new StellaInboxMessage[0];
    public String[] participantIds = new String[0];
    public String[] participantNames = new String[0];
    public String threadId;
    public String threadName;
    public long unreadCount;
    public String viewerId;
}
