package X;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Ff2.class */
public final class Ff2 implements 5SG {
    public String A00;
    public final /* synthetic */ 4Yx A01;

    public Ff2(4Yx r302, String str) {
        this.A01 = r302;
        this.A00 = str;
    }

    public void Bxs(int i, Throwable th) {
        4Yx r0 = this.A01;
        int i2 = 4Yx.A0B;
        synchronized (r0.A08) {
            4Yy r02 = r0.A01;
            if (r02.A01 == this) {
                r02.A01 = null;
                r0.A02.A03(r0.A00.now(), false);
            } else {
                r0.A03.A02("onFailure_HeaderPing", this.A00);
            }
        }
        r0.A03.A04("msisdn_fetch_failed", this.A00, i, th);
        4Yx.A01(r0);
        r0.A04.A00("ZeroHeaderRequestController-MsisdnFetchFailure", DKE.A12(th), th);
    }

    /* JADX WARN: Type inference failed for: r0v146, types: [X.4Yu, java.lang.Object] */
    public void COq(String str, int i) {
        String str2;
        String str3;
        JSONArray jSONArray;
        int i2;
        long j;
        4Yx r0 = this.A01;
        int i3 = 4Yx.A0B;
        synchronized (r0.A08) {
            4Yy r02 = r0.A01;
            if (r02.A01 != this) {
                r0.A03.A02("onSuccess_HeaderPing", this.A00);
                return;
            }
            r02.A01 = null;
            String str4 = this.A00;
            if (str == null) {
                r0.A03.A04("msisdn_fetch_empty_response", str4, i, AbF.A1D("msisdn_fetch_empty_response"));
                r0.A02.A03(r0.A00.now(), false);
                return;
            }
            try {
                JSONObject A1F = DKC.A1F(DKF.A0u(str, str));
                r0.A03.A04("msisdn_fetch_success", str4, i, (Throwable) null);
                4Yt r03 = r0.A02;
                try {
                    str2 = A1F.getString("use_for_login");
                } catch (JSONException unused) {
                    str2 = null;
                }
                try {
                    str3 = A1F.getString("use_for_fos");
                } catch (JSONException unused2) {
                    str3 = null;
                }
                String str5 = "";
                try {
                    str5 = A1F.getString("next_cursor");
                } catch (JSONException unused3) {
                }
                4Yv r04 = r03.A01;
                synchronized (r04) {
                    try {
                        HashMap A1C = DKC.A1C(DKC.A1C(r04.A0E));
                        try {
                            jSONArray = A1F.getJSONArray("entries");
                            i2 = 0;
                        } catch (JSONException e) {
                            e = e;
                        }
                        while (true) {
                            int i4 = i2;
                            if (i4 >= jSONArray.length()) {
                                break;
                            }
                            JSONObject jSONObject = jSONArray.getJSONObject(i4);
                            long j2 = jSONObject.getLong("created_at");
                            String string = jSONObject.getString("encrypted");
                            String string2 = jSONObject.getString("masked");
                            try {
                                try {
                                    j = jSONObject.getLong("entry_ttl_days");
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            } catch (JSONException unused4) {
                                j = 30;
                            }
                            int i5 = (int) j;
                            try {
                                ?? obj = new Object();
                                ((4Yu) obj).A01 = j2;
                                ((4Yu) obj).A02 = string;
                                ((4Yu) obj).A03 = string2;
                                ((4Yu) obj).A00 = i5;
                                A1C.put(jSONObject.getString("key"), obj);
                                i2 = i4 + 1;
                            } catch (JSONException e2) {
                                e = e2;
                            }
                            e = e2;
                            r03.A03.A00("ZeroHeadersStorageController-storeHPingResult-failed-to-parse-entries", e.getMessage(), e);
                            r03.A02.A00.A01(0S2.A02, str4, e.getMessage(), (String) null);
                            String str6 = str2;
                            r04.A0C = str2;
                            String str7 = str3;
                            r04.A0B = str3;
                            r04.A08 = str5;
                            4Yt.A02(r03);
                            r03.A03(r0.A00.now(), true);
                            4Yx.A02(r0);
                            4Yx.A03(r0);
                        }
                        r04.A0E = A1C;
                        4Ys r05 = r03.A02;
                        r05.A00.A02(str4, 0S2.A1J, (String) null);
                        4Yn r06 = r05.A01;
                        r06.A03("msisdn_data_stored");
                        r06.A01();
                        String str62 = str2;
                        r04.A0C = str2;
                        String str72 = str3;
                        r04.A0B = str3;
                        r04.A08 = str5;
                        4Yt.A02(r03);
                        r03.A03(r0.A00.now(), true);
                        4Yx.A02(r0);
                        4Yx.A03(r0);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (JSONException e3) {
                4Ys r07 = r0.A03;
                r07.A00.A01(0S2.A1G, str4, e3.getMessage(), (String) null);
                HashMap A0u = AnonymousClass001.A0u();
                A0u.put("error_message", e3.getMessage());
                4Yn r08 = r07.A01;
                r08.A04("msisdn_data_store_parse_error", A0u);
                r08.A00();
                r0.A04.A00("ZeroHeaderRequestController-MsisdnParseError", DKE.A12(e3), e3);
                r0.A02.A03(r0.A00.now(), false);
                4Yx.A01(r0);
            }
        }
    }
}
