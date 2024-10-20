package X;

import android.content.Context;
import com.facebook.xapp.messaging.events.common.threadview.OnDataFetchRenderStart;
import com.facebook.xapp.messaging.events.common.threadview.OnInitialMessagesRendered;
import com.facebook.xapp.messaging.events.common.threadview.OnNewMessagesRendered;
import java.util.List;

/* loaded from: A7d.class */
public final class A7d implements 1Vf {
    public long A00;
    public long A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 6sX A05;
    public final C01i A06;
    public final C01i A07;

    public A7d(Context context, 6sQ r303) {
        this.A05 = r303.B1i();
        C03i c03i = C03i.A03;
        this.A07 = C01g.A00(c03i, new AQY(r303, 35));
        this.A06 = C01g.A00(c03i, new AQY(r303, 34));
        this.A02 = 1Bq.A00(67765);
        this.A04 = 7zM.A0Q();
        this.A03 = 1Bu.A01(context, 67451);
        long j = -1;
        this.A00 = j;
        this.A01 = j;
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        List list;
        07F r309;
        int i;
        int i2;
        Integer num;
        11T.A0H(r302, str);
        int hashCode = str.hashCode();
        if (hashCode == -1834325531) {
            if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnNewMessagesRendered")) {
                OnNewMessagesRendered onNewMessagesRendered = (OnNewMessagesRendered) r302;
                11T.A0F(onNewMessagesRendered, 0);
                7zP.A0N(this.A04).AAq();
                list = onNewMessagesRendered.A00;
                11T.A0F(list, 0);
                r309 = new 07F(AnonymousClass001.A04(list), 0, -1);
                i = r309.A00;
                if (i >= 0) {
                }
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Indices range must be within list bounds.  Index range: ");
                A0k.append(r309);
                7zQ.A1Z(", list size: ", A0k, list);
                throw AnonymousClass001.A0L(A0k.toString());
            }
            throw 4YV.A0f(str);
        }
        if (hashCode != -1399920744) {
            if (hashCode == 2054794633 && str.equals("com.facebook.xapp.messaging.events.common.threadview.OnInitialMessagesRendered")) {
                OnInitialMessagesRendered onInitialMessagesRendered = (OnInitialMessagesRendered) r302;
                11T.A0F(onInitialMessagesRendered, 0);
                7zP.A0N(this.A04).AAq();
                list = onInitialMessagesRendered.A00;
                r309 = C0s8.A16(list);
                i = r309.A00;
                if (i >= 0 || i >= list.size() || (i2 = r309.A01) < 0 || i2 >= list.size()) {
                    StringBuilder A0k2 = AnonymousClass001.A0k();
                    A0k2.append("Indices range must be within list bounds.  Index range: ");
                    A0k2.append(r309);
                    7zQ.A1Z(", list size: ", A0k2, list);
                    throw AnonymousClass001.A0L(A0k2.toString());
                }
                long j = this.A00;
                int i3 = r309.A02;
                if (i3 <= 0 ? !(i3 >= 0 || i2 > i) : i <= i2) {
                    while (true) {
                        C5fv c5fv = (C5fv) list.get(i);
                        long j2 = ((C5fu) c5fv).A02;
                        j = Math.max(j, j2);
                        if (j2 >= this.A01 && j2 >= this.A00) {
                            C6jn Aiq = ((AYv) this.A07.getValue()).Aiq(c5fv);
                            if (Aiq != null) {
                                boolean A1O = AnonymousClass001.A1O(i);
                                if (Aiq != C6jn.A08) {
                                    if (Aiq.ordinal() == 8) {
                                        A1O = !(c5fv instanceof 7HJ);
                                    }
                                    if (A1O) {
                                        ((1FP) 1Br.A0B(this.A02)).D3D(3Ds.A02, 0S2.A00, new AGa(c5fv, this, Aiq), "playThreadViewParticleEffects");
                                    }
                                }
                            }
                            num = 0S2.A00;
                            if (num.intValue() != 1 || i == i2) {
                                break;
                                break;
                            }
                            i += i3;
                        }
                        num = 0S2.A01;
                        if (num.intValue() != 1) {
                            break;
                        } else {
                            i += i3;
                        }
                    }
                }
                if (j > this.A00) {
                    this.A00 = j;
                    return;
                }
                return;
            }
        } else if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnDataFetchRenderStart")) {
            OnDataFetchRenderStart onDataFetchRenderStart = (OnDataFetchRenderStart) r302;
            11T.A0F(onDataFetchRenderStart, 0);
            7zP.A0N(this.A04).AAq();
            long AtN = onDataFetchRenderStart.A00.AtN();
            if (AtN >= this.A01) {
                this.A01 = AtN;
                return;
            }
            return;
        }
        throw 4YV.A0f(str);
    }
}
