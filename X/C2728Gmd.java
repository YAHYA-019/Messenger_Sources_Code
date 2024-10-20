package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.cowatch.gen.CowatchLoggingMetadata;
import com.facebook.rsys.cowatch.gen.CowatchMediaMetadata;
import com.facebook.rsys.cowatch.gen.CowatchPlayerApi;
import com.facebook.rsys.cowatch.gen.CowatchReelsMediaInfoModel;
import java.util.ArrayList;

/* renamed from: X.Gmd, reason: case insensitive filesystem */
/* loaded from: Gmd.class */
public final class C2728Gmd extends HnN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ FbUserSession A02;
    public final /* synthetic */ RFI A03;
    public final /* synthetic */ Hlw A04;
    public final /* synthetic */ Hzd A05;
    public final /* synthetic */ RQg A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ boolean A0I;
    public final /* synthetic */ boolean A0J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2728Gmd(Context context, FbUserSession fbUserSession, RFI rfi, Hlw hlw, Hzd hzd, RQg rQg, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, boolean z, boolean z2) {
        super(context, hzd);
        this.A05 = hzd;
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A0H = str;
        this.A03 = rfi;
        this.A06 = rQg;
        this.A0C = str2;
        this.A09 = str3;
        this.A07 = str4;
        this.A00 = i;
        this.A0E = str5;
        this.A0D = str6;
        this.A0F = str7;
        this.A0J = z;
        this.A08 = str8;
        this.A0I = z2;
        this.A0B = str9;
        this.A0A = str10;
        this.A0G = str11;
        this.A04 = hlw;
    }

    public void A00() {
        Hzd hzd = this.A05;
        FbUserSession fbUserSession = this.A02;
        1BY r0 = hzd.A01.A00;
        if (!((2QO) 1Lm.A07(fbUserSession, r0, 99977)).BQf()) {
            Hzd.A00(this.A01, fbUserSession, this.A03, hzd, this.A0H);
            return;
        }
        RQg rQg = this.A06;
        DLQ dlq = rQg.A00;
        boolean A0J = dlq.A0J(false);
        String A00 = rQg.A00();
        CowatchPlayerApi cowatchPlayerApi = (CowatchPlayerApi) 1Bn.A0E((Context) null, r0, 115728);
        if (cowatchPlayerApi != null) {
            String A0C = dlq.A0C();
            CowatchLoggingMetadata cowatchLoggingMetadata = new CowatchLoggingMetadata(this.A03.A00, null, 0, 0);
            String str = this.A0C;
            if ((str == null || str.length() <= 0) && (A0C == null || A0C.length() <= 0)) {
                cowatchPlayerApi.playMedia(A00, "fb", 0L, cowatchLoggingMetadata, false, 0);
            } else {
                String str2 = this.A09;
                String str3 = this.A07;
                ArrayList A0s = AnonymousClass001.A0s();
                int i = this.A00;
                cowatchPlayerApi.playMediaOptimistic(A00, "fb", 0L, new CowatchMediaMetadata(str, A0C, dlq.getBoolean(41, false), dlq.getInt(38, 0), dlq.Amm(42, 1.0f), this.A08, null, A0J, dlq.getBoolean(53, false), dlq.getString(51), this.A0I, this.A0B, this.A0A, new CowatchReelsMediaInfoModel(str2, null, str3, null, A0s, i != 0 ? i != 1 ? null : 7zK.A00(62) : "Public", null, i, this.A0E, this.A0D, this.A0F, this.A0J)), cowatchLoggingMetadata, 0, this.A0G);
            }
        }
        Hlw hlw = this.A04;
        if (hlw != null) {
            hlw.A00();
        }
        C00i c00i = hzd.A06.A00;
        if (((Ewj) c00i.get()).A01()) {
            ((Ewj) c00i.get()).A00();
        }
    }
}
