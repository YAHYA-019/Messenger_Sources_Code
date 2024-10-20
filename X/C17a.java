package X;

import android.util.Pair;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.17a, reason: invalid class name */
/* loaded from: 17a.class */
public final class C17a implements Runnable {
    public static final String __redex_internal_original_name = "FbnsConnectionManager$6";
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ C17n A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ boolean A04;

    public C17a(Pair pair, C17n c17n, Boolean bool, Integer num, boolean z) {
        this.A01 = c17n;
        this.A00 = pair;
        this.A04 = z;
        this.A02 = bool;
        this.A03 = num;
    }

    @Override // java.lang.Runnable
    public void run() {
        C17n c17n;
        List list;
        List list2;
        String A03;
        byte[] AI8;
        try {
            Pair pair = this.A00;
            Boolean bool = null;
            if (pair != null) {
                list = (List) pair.first;
                list2 = (List) pair.second;
            } else {
                list = null;
                list2 = null;
            }
            ArrayList A0s = AnonymousClass001.A0s();
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    A0s.add(((SubscribeTopic) it.next()).A01);
                }
            }
            c17n = this.A01;
            19I r0 = c17n.A0V;
            if (this.A04) {
                A03 = null;
            } else {
                bool = this.A02;
                A03 = 0LZ.A00().A03(bool);
            }
            AI8 = r0.AI8(bool, this.A03, A03, list, A0s);
        } catch (0Mb e) {
            c17n = this.A01;
            0fH.A0q(c17n.A0Y, "exception/MqttException", e);
        }
        if (AI8 == null) {
            0fH.A0j(c17n.A0Y, "Failed to create /t_fs payload");
            return;
        }
        0fH.A0d(list, list2, c17n.A0Y, "send/publish/t_fs (after_diff); sub=%s, unsub=%s");
        final List list3 = list;
        final List list4 = list2;
        int A0A = c17n.A0A(new 18Y() { // from class: X.0l7
            public void Bxb(C18h c18h) {
                C17a c17a = C17a.this;
                C17n c17n2 = c17a.A01;
                0fH.A0f(list3, list4, c17n2.A0Y, "send/publish/t_fs (onFailure); sub=%s, unsub=%s");
                c17n2.A0R(c17a.A02);
            }

            public void COO(long j) {
                C17a c17a = C17a.this;
                C17n c17n2 = c17a.A01;
                String str = c17n2.A0Y;
                List list5 = list3;
                List list6 = list4;
                0fH.A0f(list5, list6, str, "send/publish/t_fs (onSuccess); sub=%s, unsub=%s");
                c17n2.A0S(c17a.A02, list5, list6);
            }
        }, 0S2.A01, XplatNativeClientWrapper.UPDATE_FOREGROUND_TOPIC, AI8);
        if (A0A >= 0) {
            if (list != null) {
                c17n.A16.CQr(list, A0A);
            }
            if (list2 != null) {
                c17n.A16.CQs(list2, A0A);
                return;
            }
            return;
        }
        c17n.A0Q(this.A02);
    }
}
