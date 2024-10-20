package com.facebook.messaging.bugreporter.send;

import X.11T;
import X.1BK;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.send.SendError;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.io.Serializable;

/* loaded from: SendFailuresDataRecorder$SendFailureData.class */
public final class SendFailuresDataRecorder$SendFailureData implements Serializable {
    public final String errorDetail;
    public final String errorMessage;
    public final int errorNumber;
    public final long errorTimestamp;
    public final String errorType;
    public final String offlineThreadingId;
    public final String originalException;
    public final String sendChannel;
    public final String threadKey;

    public SendFailuresDataRecorder$SendFailureData(Message message) {
        ThreadKey threadKey = message.A0V;
        if (threadKey == null) {
            throw 1BK.A0h();
        }
        String A0u = threadKey.A0u();
        11T.A0A(A0u);
        this.threadKey = A0u;
        String str = message.A1g;
        this.offlineThreadingId = str == null ? "" : str;
        this.sendChannel = message.A03().toString();
        SendError A08 = message.A08();
        11T.A0A(A08);
        String str2 = A08.A02.serializedString;
        11T.A0A(str2);
        this.errorType = str2;
        this.errorNumber = A08.A00;
        this.errorDetail = A08.A03;
        this.errorMessage = A08.A06;
        this.originalException = A08.A07;
        this.errorTimestamp = A08.A01;
    }
}
