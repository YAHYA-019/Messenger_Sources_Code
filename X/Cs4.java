package X;

import android.net.Uri;
import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.facebook.user.model.User;

/* loaded from: Cs4.class */
public final class Cs4 implements DIn {
    public final C1U A00;
    public final /* synthetic */ AcQ A01;
    public final /* synthetic */ Buo A02;
    public final /* synthetic */ C49 A03;
    public final /* synthetic */ 53N A04;

    public Cs4(AcQ acQ, Buo buo, C49 c49, 53N r305) {
        this.A01 = acQ;
        this.A03 = c49;
        this.A02 = buo;
        this.A04 = r305;
        this.A00 = new C1U(c49);
    }

    @Override // X.DIn
    public void D9q(PlatformSearchGameData platformSearchGameData) {
    }

    @Override // X.DIn
    public void D9r(PlatformSearchUserData platformSearchUserData) {
    }

    @Override // X.DIn
    public void D9s(ThreadSummary threadSummary) {
        String str;
        Buo buo = this.A02;
        53N r0 = this.A04;
        C1U c1u = this.A00;
        7zT.A1S(threadSummary, r0, c1u);
        String A17 = AbK.A17(threadSummary);
        int i = 0;
        0fH.A0g(r0, "MsysQueryItemConverterHelper", "type : %s");
        switch (r0.ordinal()) {
            case 3:
                i = 3;
                break;
            case 4:
            case 5:
            case 31:
            case 32:
                i = 17;
                break;
            case 6:
            case 7:
            case 29:
            case 30:
                i = 13;
                break;
            case 12:
                i = 12;
                break;
            case 15:
                i = 5;
                break;
            case 36:
                i = 14;
                break;
            case 37:
                i = 18;
                break;
            default:
                0fH.A14("MsysQueryItemConverterHelper", "MessagingSearchResultType: %s is not supported!", new Object[]{r0.toString()});
                break;
        }
        String str2 = threadSummary.A20;
        str = "";
        if (str2 == null) {
            str2 = str;
        }
        Uri uri = threadSummary.A0V;
        c1u.A00(A17, str2, uri != null ? String.valueOf(uri) : "", threadSummary.A1s, null, null, i, buo.A01.now());
    }

    @Override // X.DIn
    public void D9t(C1772As6 c1772As6) {
    }

    @Override // X.DIn
    public void D9u(MessageSearchMessageModel messageSearchMessageModel) {
    }

    @Override // X.DIn
    public void D9v(MessageSearchThreadModel messageSearchThreadModel) {
    }

    @Override // X.DIn
    public void D9x(User user) {
        C00i c00i = this.A01.A15;
        c00i.get();
        c00i.get();
        if (!user.A0D() || user.A20) {
            Buo buo = this.A02;
            53N r0 = this.A04;
            C1U c1u = this.A00;
            1BL.A1F(r0, c1u);
            String str = user.A13;
            int i = 0;
            switch (r0.ordinal()) {
                case 0:
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 8:
                case 9:
                    i = 4;
                    break;
                case 12:
                    i = 11;
                    break;
                case 18:
                    i = 6;
                    break;
                case 19:
                    i = 7;
                    break;
                case 20:
                    i = 8;
                    break;
                case 21:
                    i = 9;
                    break;
                default:
                    0fH.A14("MsysQueryItemConverterHelper", "MessagingSearchResultType: %s is not supported!", new Object[]{r0.toString()});
                    break;
            }
            c1u.A00(str, user.A0X.displayName, user.A07(), user.A1W, user.A06(), user.A08(), i, buo.A01.now());
        }
    }
}
