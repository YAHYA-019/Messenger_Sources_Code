package X;

import org.json.JSONObject;

/* renamed from: X.5mb, reason: invalid class name */
/* loaded from: 5mb.class */
public final class C5mb implements C5kd {
    public static final C5mb A00 = new Object();
    public static final C5g3 A01 = C5mc.A00;

    @Override // X.C5kd
    public C5g3 Asj() {
        return A01;
    }

    @Override // X.C5kd
    public /* bridge */ /* synthetic */ 5PP AxZ(C5pu c5pu, 4lD r303, C4l9 c4l9, InterfaceC07894l7 interfaceC07894l7, 5uN r306, C5to c5to, int i) {
        C5g9 A02;
        if (c5pu == null || ((1qX) c5pu).mResultSet.getCount() == 0 || c5pu.AXc(0) != 7) {
            return null;
        }
        C5g9 BLI = c5pu.BLI(0);
        6Bn r311 = null;
        if (BLI != null && (A02 = BLI.A02(6Ey.class, "layout_config")) != null) {
            JSONObject jSONObject = A02.A00;
            r311 = new 6Bn(jSONObject.optBoolean("centered", 4YV.A1U(jSONObject.optInt("centered"))), jSONObject.optInt("collapsible_id"));
        }
        return r311;
    }

    @Override // X.C5kd
    public Integer B7X() {
        return null;
    }
}
