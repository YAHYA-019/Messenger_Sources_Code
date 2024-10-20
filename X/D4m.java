package X;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.presence.api.model.RichStatusTimestamp;
import com.facebook.ui.emoji.model.Emoji;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: D4m.class */
public final class D4m implements 1K9 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ 1Iw A02;
    public final /* synthetic */ RichStatusTimestamp A03;
    public final /* synthetic */ RichStatusTimestamp A04;
    public final /* synthetic */ C1566All A05;
    public final /* synthetic */ Emoji A06;
    public final /* synthetic */ Emoji A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public D4m(View view, View view2, 1Iw r304, RichStatusTimestamp richStatusTimestamp, RichStatusTimestamp richStatusTimestamp2, C1566All c1566All, Emoji emoji, Emoji emoji2, String str, String str2) {
        this.A05 = c1566All;
        this.A00 = view;
        this.A02 = r304;
        this.A03 = richStatusTimestamp;
        this.A06 = emoji;
        this.A08 = str;
        this.A01 = view2;
        this.A04 = richStatusTimestamp2;
        this.A07 = emoji2;
        this.A09 = str2;
    }

    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        C1566All c1566All = this.A05;
        View view = this.A01;
        Emoji emoji = this.A07;
        String str = this.A09;
        String message = th.getMessage();
        C1566All.A07(view, c1566All, 2131967679);
        CP2 A06 = C1566All.A06(c1566All);
        String A07 = emoji.A07();
        String str2 = c1566All.A08;
        A06.A04(c1566All.A04, c1566All.A07, str, A07, str2, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, message);
    }

    public void onSuccess(Object obj) {
        long j;
        String A02;
        BFh bFh = (BPj) obj;
        if (!(bFh instanceof BFh)) {
            if (bFh instanceof BFg) {
                C1566All c1566All = this.A05;
                View view = this.A00;
                Emoji emoji = this.A06;
                String str = this.A08;
                C1566All.A07(view, c1566All, 2131967679);
                C1566All.A06(c1566All).A04(c1566All.A04, c1566All.A07, str, emoji.A07(), c1566All.A08, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, "Failed updating status. Server could not set a status.");
                return;
            }
            return;
        }
        C1566All c1566All2 = this.A05;
        View view2 = this.A00;
        1Iw r0 = this.A02;
        RichStatusTimestamp richStatusTimestamp = this.A03;
        C1773As7 c1773As7 = bFh.A00;
        Emoji emoji2 = c1773As7.A02;
        String str2 = c1773As7.A0A;
        if (emoji2 != null) {
            FbUserSession fbUserSession = c1566All2.A01;
            String str3 = "fbUserSession";
            if (fbUserSession != null) {
                Context context = view2.getContext();
                11T.A0A(context);
                CM0 cm0 = (CM0) 1Lo.A04(context, fbUserSession, (1BY) null, 83644);
                Integer num = richStatusTimestamp.A01;
                Integer num2 = 0S2.A00;
                boolean A1V = 1BK.A1V(num, num2);
                if (num == 0S2.A01) {
                    1Bn.A0A(83582);
                    long j2 = richStatusTimestamp.A00;
                    Calendar.getInstance().setTimeInMillis(j2);
                    j = TimeUnit.HOURS.toMillis(r0.get(11)) + TimeUnit.MINUTES.toMillis(r0.get(12)) + AbN.A04();
                } else {
                    j = richStatusTimestamp.A00;
                }
                11T.A0F(str2, 2);
                JSONObject A12 = AnonymousClass001.A12();
                String A07 = emoji2.A07();
                A12.put("emoji", A07);
                A12.put("text", str2);
                A12.put("isAbsoluteTime", A1V);
                A12.put("expirationTimeMs", j);
                JSONArray A01 = CM0.A01(cm0);
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(A12);
                int length = A01.length();
                for (int i = 0; i < length && jSONArray.length() < 2yD.A00(1Br.A07(((C2gx) 1Bn.A0A(66728)).A00), 36598034805034873L); i++) {
                    Object obj2 = A01.get(i);
                    11T.A0I(obj2, 1BJ.A00(206));
                    JSONObject jSONObject = (JSONObject) obj2;
                    if (!11T.A0O(jSONObject.getString("emoji"), A12.getString("emoji")) || !11T.A0O(jSONObject.getString("text"), A12.getString("text"))) {
                        jSONArray.put(A01.get(i));
                    }
                }
                1Ql A08 = 1Br.A08(cm0.A02);
                A08.CaL(1NK.A66.A0F(cm0.A00.A02), jSONArray.toString());
                A08.commit();
                FbUserSession fbUserSession2 = c1566All2.A01;
                if (fbUserSession2 != null) {
                    11T.A0A(context);
                    ((CP2) 1Lo.A04(context, fbUserSession2, (1BY) null, 83643)).A04(richStatusTimestamp, c1566All2.A07, str2, A07, c1566All2.A08, "update", (String) null);
                    InputMethodManager inputMethodManager = c1566All2.A00;
                    if (inputMethodManager != null) {
                        AbH.A1L(view2, inputMethodManager);
                        1pI A00 = 1vD.A00(view2);
                        A00.CeH(C1566All.__redex_internal_original_name);
                        RichStatusTimestamp richStatusTimestamp2 = c1566All2.A04;
                        if (richStatusTimestamp2 == null) {
                            A02 = "";
                        } else {
                            long A03 = C1566All.A03(richStatusTimestamp2);
                            long hours = TimeUnit.MILLISECONDS.toHours(A03);
                            if (richStatusTimestamp2.A01 == num2) {
                                A02 = 4YV.A0o(4YU.A0E(r0), (int) hours, 2131820589);
                                11T.A0D(A02);
                            } else {
                                A02 = ((C90) 1Bn.A0A(83582)).A02(7zM.A0B(r0.A0D), 2131955357, 2131955358, 2131955356, A03);
                            }
                        }
                        K8M A012 = K8M.A01(view2, A02, 0);
                        A012.A0C(new CYr(26, A00, view2, c1566All2), 4YU.A0E(r0).getString(2131955353));
                        A012.A06();
                        return;
                    }
                    str3 = "inputMethodManager";
                }
            }
            11T.A0L(str3);
            throw 0Q8.createAndThrow();
        }
    }
}
