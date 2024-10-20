package com.facebook.rsys.call.datamessage.gen;

import X.2JQ;
import X.7zP;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: DataMessage.class */
public class DataMessage {
    public static 2JQ CONVERTER = IR0.A00(25);
    public static long sMcfTypeId;
    public final byte[] payload;
    public final ArrayList recipients;
    public final String topic;

    public DataMessage(ArrayList arrayList, String str, byte[] bArr) {
        7zP.A1S(arrayList, str, bArr);
        this.recipients = arrayList;
        this.topic = str;
        this.payload = bArr;
    }

    public static native DataMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof DataMessage)) {
                return false;
            }
            DataMessage dataMessage = (DataMessage) obj;
            if (this.recipients.equals(dataMessage.recipients) && this.topic.equals(dataMessage.topic) && Arrays.equals(this.payload, dataMessage.payload)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.topic, AbstractC2327GOs.A08(this.recipients)) + Arrays.hashCode(this.payload);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DataMessage{recipients=");
        A0k.append(this.recipients);
        A0k.append(",topic=");
        A0k.append(this.topic);
        A0k.append(",payload=");
        return AbstractC2327GOs.A0U(this.payload, A0k);
    }
}
