package com.facebook.messaging.aibot.memory.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zM;
import X.C04v;

/* loaded from: MemoryData.class */
public final class MemoryData extends C04v {
    public final String A00;
    public final String A01;

    public MemoryData(String str, String str2) {
        1BL.A1F(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MemoryData)) {
                return false;
            }
            MemoryData memoryData = (MemoryData) obj;
            if (!11T.A0O(this.A00, memoryData.A00) || !11T.A0O(this.A01, memoryData.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, 4YV.A02(this.A00));
    }
}
