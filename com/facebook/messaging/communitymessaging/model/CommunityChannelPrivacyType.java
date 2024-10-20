package com.facebook.messaging.communitymessaging.model;

import X.02J;
import X.C00883pP;
import X.C00t;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: CommunityChannelPrivacyType.class */
public final class CommunityChannelPrivacyType {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ CommunityChannelPrivacyType[] $VALUES;
    public static final C00883pP Companion;
    public static final Map reverseMap;
    public final int chatPrivacy;
    public static final CommunityChannelPrivacyType PUBLIC = new CommunityChannelPrivacyType("PUBLIC", 0, 0);
    public static final CommunityChannelPrivacyType ADMIN_ONLY_CHAT_PRIVACY = new CommunityChannelPrivacyType("ADMIN_ONLY_CHAT_PRIVACY", 1, 1);
    public static final CommunityChannelPrivacyType ADMIN_AND_MOD_CHAT_PRIVACY = new CommunityChannelPrivacyType("ADMIN_AND_MOD_CHAT_PRIVACY", 2, 2);
    public static final CommunityChannelPrivacyType SUPPORTERS_ONLY = new CommunityChannelPrivacyType("SUPPORTERS_ONLY", 3, 3);
    public static final CommunityChannelPrivacyType PRIVATE = new CommunityChannelPrivacyType("PRIVATE", 4, 4);
    public static final CommunityChannelPrivacyType BROADCAST = new CommunityChannelPrivacyType("BROADCAST", 5, 5);

    public static final /* synthetic */ CommunityChannelPrivacyType[] $values() {
        return new CommunityChannelPrivacyType[]{PUBLIC, ADMIN_ONLY_CHAT_PRIVACY, ADMIN_AND_MOD_CHAT_PRIVACY, SUPPORTERS_ONLY, PRIVATE, BROADCAST};
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [X.3pP, java.lang.Object] */
    static {
        CommunityChannelPrivacyType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = C00t.A00($values);
        Companion = new Object();
        CommunityChannelPrivacyType[] values = values();
        int A00 = 02J.A00(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A00 < 16 ? 16 : A00);
        for (CommunityChannelPrivacyType communityChannelPrivacyType : values) {
            linkedHashMap.put(Integer.valueOf(communityChannelPrivacyType.chatPrivacy), communityChannelPrivacyType);
        }
        reverseMap = linkedHashMap;
    }

    public CommunityChannelPrivacyType(String str, int i, int i2) {
        this.chatPrivacy = i2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CommunityChannelPrivacyType valueOf(String str) {
        return (CommunityChannelPrivacyType) Enum.valueOf(CommunityChannelPrivacyType.class, str);
    }

    public static CommunityChannelPrivacyType[] values() {
        return (CommunityChannelPrivacyType[]) $VALUES.clone();
    }

    public final int getChatPrivacy() {
        return this.chatPrivacy;
    }
}
