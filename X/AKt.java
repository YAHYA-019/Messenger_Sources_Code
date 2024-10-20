package X;

import android.content.Context;
import android.os.Parcelable;
import com.facebook.messaging.attachments.model.ImageAttachmentDataList;
import com.facebook.messaging.dialog.MenuDialogItem;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;

/* loaded from: AKt.class */
public final class AKt extends C00q implements C00m {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKt(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        super(0);
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A05 = str;
        this.A01 = obj4;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                C2945JeA c2945JeA = (C2945JeA) this.A03;
                C00m c00m = (C00m) this.A02;
                c2945JeA.A08((KMW) this.A01, (Kr9) this.A04, c00m);
                break;
            case 1:
                C9iC c9iC = (C9iC) this.A04;
                ((C9hq) 1Br.A0B(c9iC.A04)).A01((06Z) this.A02, (ThreadKey) this.A03);
                if (11T.A0O(this.A05, "MEDIA_VIEWER")) {
                    4YV.A11(c9iC.A05).execute(new ADk((Context) this.A01));
                    break;
                }
                break;
            case 2:
                9YA r0 = (9YA) 1Br.A0B(((C65e) this.A04).A00);
                06Z r02 = (06Z) this.A01;
                ThreadKey threadKey = (ThreadKey) this.A03;
                List list = ((AnonymousClass622) this.A02).A0Q;
                11T.A09(list);
                r0.A00(new ImageAttachmentDataList(list), r02, threadKey, this.A05, "MUSTACHE_NUX");
                break;
            case 3:
                9yB r03 = (9yB) this.A04;
                9YA r04 = (9YA) 1Br.A0B(r03.A05);
                06Z r05 = (06Z) this.A02;
                ThreadKey threadKey2 = (ThreadKey) this.A03;
                Parcelable parcelable = ((MenuDialogItem) this.A01).A03;
                11T.A0A(parcelable);
                r04.A00(parcelable, r05, threadKey2, this.A05, "MESSAGE_ACTION");
                9nJ A0j = 7zQ.A0j(r03.A06);
                11T.A0F(threadKey2, 0);
                9nJ.A00(C98N.MESSAGE_CONTEXT_MENU, 98L.A05, threadKey2, A0j, "click", 0, 0L);
                break;
            default:
                1Br.A0C(((9MW) this.A04).A00);
                Context context = (Context) this.A01;
                82Y r06 = (82Y) this.A03;
                String str = this.A05;
                06Z r07 = (06Z) this.A02;
                7zT.A1S(context, r06, str);
                11T.A0F(r07, 3);
                Object obj = r06.A02;
                if (obj != null) {
                    CP0 cp0 = new CP0("com.bloks.www.bloks.mwb.scams.marketplace.ixt.interstitial");
                    cp0.A05("other_user_id", String.valueOf(r06.A01));
                    cp0.A05("thread_id", String.valueOf(obj));
                    cp0.A05("intervention_scenario", str);
                    DqD A03 = cp0.A03();
                    DKT A0P = 7zQ.A0P();
                    DKT.A03(context, r07, new CaS(context, r07, A0P, 3), A0P, A03, 75, 75, 64);
                    break;
                }
                break;
        }
        return 04S.A00;
    }
}
