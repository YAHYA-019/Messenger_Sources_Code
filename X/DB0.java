package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.service.model.SendMessageParams;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: DB0.class */
public final class DB0 implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public DB0(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        switch (this.A00) {
            case 0:
                return 6H7.A00((FbUserSession) this.A02, (6H7) this.A01, (C7Zl) this.A03);
            case 1:
                return ((4bT) this.A03).A00((FbUserSession) this.A01, (2eW) this.A02);
            case 2:
                C5Pr c5Pr = (C5Pr) this.A01;
                C45d c45d = (C45d) c5Pr.A0P.get();
                Message message = (Message) this.A02;
                c45d.A0K(message.A0V, "send_msg_future_called", message.A1g);
                BtD btD = (BtD) c5Pr.A0b.get();
                SendMessageParams sendMessageParams = (SendMessageParams) this.A03;
                Message message2 = sendMessageParams.A05;
                ImmutableList immutableList = message2.A0z;
                if (!immutableList.isEmpty()) {
                    int length = C5ep.values().length;
                    int[] iArr = new int[length];
                    1Du it = immutableList.iterator();
                    while (it.hasNext()) {
                        int ordinal = 4YU.A0Z(it).A0O.ordinal();
                        iArr[ordinal] = iArr[ordinal] + 1;
                    }
                    5PI A0d = AbF.A0d(message2);
                    HashMap hashMap = new HashMap(message2.A13);
                    for (int i = 0; i < length; i++) {
                        if (iArr[i] != 0) {
                            hashMap.put(C5ep.values()[i].toString(), Integer.toString(iArr[i]));
                        }
                    }
                    A0d.A0K(hashMap);
                    message2 = 4YU.A0U(A0d);
                }
                btD.A01.A02();
                1Ql edit = btD.A03.A02.A00.edit();
                edit.Cdj(Ba6.A03);
                edit.commit();
                try {
                    return ((CPT) btD.A00.get()).A04(sendMessageParams);
                } catch (Throwable th) {
                    throw btD.A02.A00(message2, 5Pk.A04, "send_message_async", th);
                }
            default:
                ImmutableList.Builder builder = ImmutableList.builder();
                ImmutableList immutableList2 = (ImmutableList) this.A03;
                int size = immutableList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    MediaResource A0a = 4YU.A0a(immutableList2, i2);
                    if (A0a.A0Q == 5HP.A0F) {
                        C5Pr c5Pr2 = (C5Pr) this.A01;
                        A0a = ((5HV) c5Pr2.A0I.get()).A07(c5Pr2.A08, A0a);
                    }
                    builder.m11011add((Object) A0a);
                }
                5PI A0d2 = AbF.A0d((Message) this.A02);
                A0d2.A0I(builder.build());
                return 4YU.A0U(A0d2);
        }
    }
}
