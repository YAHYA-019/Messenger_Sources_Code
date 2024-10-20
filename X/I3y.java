package X;

import com.facebook.entitypresence.EntityPresenceBladeRunnerHelper;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: I3y.class */
public final class I3y {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public boolean A04;
    public final C0dp A05;
    public final C0dr A06;
    public final I3v A07;
    public final String A09;
    public final List A0A;
    public final C00i A08 = 1BQ.A00();
    public final C00i A0B = AbH.A0N();

    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a5, code lost:
    
        if (java.lang.Math.random() <= (r0 != null ? r0.doubleValue() : X.1BK.A0N(r0).Ai7(37155298221555839L))) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public I3y(X.I3v r302) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I3y.<init>(X.I3v):void");
    }

    public static JSONObject A00(I3y i3y, String str) {
        JSONObject put = AnonymousClass001.A12().put("action", str).put("client_subscription_id", i3y.A09);
        long now = i3y.A06.now() - i3y.A01;
        return put.put("client_time_ms", now < 0 ? i3y.A05.now() : i3y.A03 + now).put("gateway_connected", 1).put("sequence_id", i3y.A02);
    }

    public EntityPresenceBladeRunnerHelper.LogInfo A01(String str) {
        this.A00 = 1BK.A0N(this.A08).Auy(36592348268069574L);
        this.A03 = this.A05.now();
        this.A01 = this.A06.now();
        this.A02++;
        if (!this.A04) {
            return null;
        }
        try {
            List list = this.A0A;
            JSONObject put = A00(this, "enter").put("action_reason", str);
            I3v i3v = this.A07;
            list.add(put.put("capabilities", 0L).put("entity_type", i3v.A08).put("entity_id", i3v.A07).toString());
        } catch (JSONException unused) {
        }
        return new EntityPresenceBladeRunnerHelper.LogInfo(this.A09, this.A02);
    }

    public void A02(String str) {
        this.A02++;
        if (this.A04) {
            try {
                this.A0A.add(A00(this, "leave").put("action_reason", str).toString());
            } catch (JSONException unused) {
            }
            1UG A08 = 1BK.A08(1BK.A07(this.A0B), "entity_presence_activity_batch");
            if (A08.isSampled()) {
                A08.A7h("events", this.A0A);
                A08.BZL();
                1BK.A1Q("EntityPresenceSessionLogger uploaded logs for for subscriptionId=", this.A09, "EntityPresenceSessionLogger");
            }
        }
    }
}
