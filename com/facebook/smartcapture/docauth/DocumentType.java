package com.facebook.smartcapture.docauth;

import X.C00t;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: DocumentType.class */
public final class DocumentType {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ DocumentType[] $VALUES;
    public static final DocumentType ID1 = new DocumentType("ID1", 0, "ID1");
    public static final DocumentType ID2 = new DocumentType("ID2", 1, "ID2");
    public static final DocumentType ID3 = new DocumentType("ID3", 2, "ID3");
    public final String type;

    public static final /* synthetic */ DocumentType[] $values() {
        return new DocumentType[]{ID1, ID2, ID3};
    }

    static {
        DocumentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = C00t.A00($values);
    }

    public DocumentType(String str, int i, String str2) {
        this.type = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static DocumentType valueOf(String str) {
        return (DocumentType) Enum.valueOf(DocumentType.class, str);
    }

    public static DocumentType[] values() {
        return (DocumentType[]) $VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }

    public final float getWidthToHeightRatio() {
        int ordinal = ordinal();
        float f = 1.5857725f;
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 1.418919f;
            }
            if (ordinal == 2) {
                f = 1.4204545f;
            }
        }
        return f;
    }
}
