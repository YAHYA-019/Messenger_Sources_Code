package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.pages.app.clicktomessengerads.reportedoutcomes.permissions.ui.fragments.ReportedOutcomesPermissionsFragment;
import com.facebook.tigon.TigonErrorException;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* loaded from: ABp.class */
public final class ABp implements 1K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ABp(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public void onFailure(Throwable th) {
        String str;
        String str2;
        Function1 function1;
        Object obj;
        Object obj2;
        String str3;
        switch (this.A00) {
            case 0:
                ((C9H4) this.A01).A00.A08.set(false);
                return;
            case 1:
            case 5:
            case 16:
            case 17:
            default:
                return;
            case 2:
                AZG azg = (AZG) this.A02;
                if (azg == null || (th instanceof CancellationException)) {
                    return;
                }
                azg.BxJ();
                return;
            case 3:
                11T.A0F(th, 0);
                0fH.A0p("ThreadSettingSharedContentView", "Failed to load media attachments for thread pk, exception thrown", th);
                function1 = (Function1) this.A01;
                obj = false;
                function1.invoke(obj);
                return;
            case 4:
                ((AZH) this.A02).Bxh(0Pz.A1B("Exception for unsent message: ", th), !(th instanceof TigonErrorException));
                return;
            case 6:
                str = "ScheduledBreaksBlockingScreenFragment";
                str2 = "fetch thread key failure";
                0fH.A0j(str, str2);
                return;
            case 7:
            case 13:
            case 23:
                function1 = (Function1) this.A01;
                obj = this.A02;
                function1.invoke(obj);
                return;
            case 8:
                11T.A0F(th, 0);
                0fH.A0v(1BJ.A00(269), 1BJ.A00(734), th);
                return;
            case 9:
                11T.A0F(th, 0);
                0fH.A0r("HighlightsTabComposerMessageSender", "Send message failure", th);
                AaX aaX = ((A4w) this.A02).A0B;
                if (aaX != null) {
                    aaX.C75();
                    return;
                }
                return;
            case 10:
                str = "JewelDataProvider";
                str2 = "Failed to resolve thread key for e2ee reply reminder";
                0fH.A0j(str, str2);
                return;
            case 11:
                8uD r0 = (8uD) this.A01;
                CfG cfG = r0.A00;
                if (cfG != null) {
                    cfG.D2v();
                }
                Context context = (Context) this.A02;
                String string = context.getString(2131959143);
                String string2 = context.getString(2131959142);
                DR6 A02 = ((C5ic) r0.A04.get()).A02(context);
                A02.A03(string);
                A02.A0J(string2);
                A02.A0A((DialogInterface.OnClickListener) null);
                A02.A0K(true);
                7zN.A13(A02);
                return;
            case 12:
                7zQ.A16((Context) this.A02, 2131960007);
                return;
            case 14:
                1BK.A09(((9R4) this.A01).A01).D0v("MontageInstagramProfilePictureHelper", 0Pz.A1B("Failed to fetch ig user tile. ", th));
                return;
            case 15:
                11T.A0F(th, 0);
                0fH.A0r("SharedTabHostFragment", "Failed to fetch content", th);
                8HB r02 = (8HB) this.A02;
                9KU r03 = r02.A06;
                if (r03 == null) {
                    str3 = "tabContentInterface";
                } else {
                    String str4 = ((C96h) this.A01).finderKey;
                    MigColorScheme migColorScheme = r02.A09;
                    if (migColorScheme == null) {
                        str3 = "colorScheme";
                    } else {
                        1LI AKY = r03.A00.A00.AKY(migColorScheme, str4);
                        9Sr A03 = 8HB.A03(r02);
                        if (A03 == null) {
                            return;
                        }
                        1Iw r04 = r02.A01;
                        if (r04 != null) {
                            LithoView lithoView = A03.A00;
                            if (lithoView == null) {
                                lithoView = new LithoView(r04);
                                MigColorScheme.A00(lithoView, A03.A03);
                                A03.A00 = lithoView;
                            }
                            lithoView.A0y(AKY);
                            return;
                        }
                        str3 = "componentContext";
                    }
                }
                11T.A0L(str3);
                throw 0Q8.createAndThrow();
            case 18:
                ((MIN) this.A02).D2v();
                return;
            case 19:
                11T.A0F(th, 0);
                ((C2lh) this.A02).A02(0Pz.A1B("Something went wrong: ", th));
                return;
            case 20:
                obj2 = this.A02;
                ((1FX) obj2).setException(th);
                return;
            case 21:
            case 22:
                7zR.A14((Fragment) this.A02);
                ReportedOutcomesPermissionsFragment.A02 = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                return;
            case 24:
                11T.A0F(th, 0);
                7zL.A1T(this.A01, th);
                return;
            case 25:
                ((1PA) this.A02).A01();
                return;
            case 26:
                11T.A0F(th, 0);
                obj2 = this.A01;
                ((1FX) obj2).setException(th);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0370, code lost:
    
        if (android.text.TextUtils.isEmpty(r308) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03cb, code lost:
    
        if (android.text.TextUtils.isEmpty(r304) != false) goto L89;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v503, types: [X.9Gx, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 4090
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ABp.onSuccess(java.lang.Object):void");
    }
}
