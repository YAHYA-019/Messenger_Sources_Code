package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.abtest.qe.protocol.sync.SyncMultiQuickExperimentParams;
import com.facebook.abtest.qe.protocol.sync.SyncQuickExperimentParams;
import com.facebook.abtest.qe.protocol.sync.user.SyncMultiQuickExperimentUserInfoResult;
import com.facebook.abtest.qe.protocol.sync.user.SyncQuickExperimentUserInfoResult;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: Fi1.class */
public final class Fi1 implements 1Ro {
    public static final 1G2 A05 = 1G3.A01(1G0.A00, "qe_last_fetch_ids_hash");
    public static final String __redex_internal_original_name = "SyncMultiQuickExperimentUserInfoMethod";
    public String A00;
    public boolean A01;
    public final EUN A02;
    public final 1Ex A03;
    public final FbSharedPreferences A04;

    public Fi1() {
        1Ex r0 = (1Ex) 1Bi.A03(83426);
        EUN eun = (EUN) 1Bn.A0A(99404);
        FbSharedPreferences A0i = AbJ.A0i();
        this.A03 = r0;
        this.A02 = eun;
        this.A04 = A0i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x01ca, code lost:
    
        if (r0 == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ X.C04103zy B7F(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fi1.B7F(java.lang.Object):X.3zy");
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        24X A0D;
        SyncMultiQuickExperimentParams syncMultiQuickExperimentParams = (SyncMultiQuickExperimentParams) obj;
        try {
            24X A01 = anonymousClass439.A01();
            if (!this.A01) {
                String str = this.A00;
                1Ql edit = this.A04.edit();
                edit.CaL(A05, str);
                edit.commit();
            }
            if (A01 == null) {
                return null;
            }
            ArrayList A0s = AnonymousClass001.A0s();
            ImmutableList immutableList = syncMultiQuickExperimentParams.A00;
            for (int i = 0; i < A01.A05(); i++) {
                24X A0B = A01.A0B(i);
                SyncQuickExperimentParams syncQuickExperimentParams = (SyncQuickExperimentParams) immutableList.get(i);
                SyncQuickExperimentUserInfoResult syncQuickExperimentUserInfoResult = null;
                if (A0B != null && syncQuickExperimentParams != null && (A0D = A0B.A0D("data")) != null) {
                    if (A0D.A0S()) {
                        if (A0D.A03() == 0) {
                            syncQuickExperimentUserInfoResult = new SyncQuickExperimentUserInfoResult(RegularImmutableMap.A03, syncQuickExperimentParams.A00, "local_default_group", "", false, false);
                        }
                    } else if (A0D.A05() != 0) {
                        String A0I = A0D.A0B(0).A0D("group").A0I();
                        if (A0I == null) {
                            A0I = "local_default_group";
                        }
                        24X A0D2 = A0D.A0B(0).A0D("params");
                        String str2 = syncQuickExperimentParams.A00;
                        boolean A0P = A0D.A0B(0).A0D("in_experiment").A0P();
                        boolean A0P2 = A0D.A0B(0).A0D("in_deploy_group").A0P();
                        String A0I2 = A0D.A0B(0).A0D("hash").A0I();
                        ImmutableMap.Builder A0c = 1BK.A0c();
                        Iterator A0N = A0D2.A0N();
                        while (A0N.hasNext()) {
                            Map.Entry A0z = AnonymousClass001.A0z(A0N);
                            24X A0D3 = ((24X) A0z.getValue()).A0D(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                            if (A0D3 != null && (A0D3.A03() == 1 || A0D3.A03() == 2)) {
                                A0c.put(A0z.getKey(), AbH.A1A((24X) A0z.getValue(), "value"));
                            }
                        }
                        syncQuickExperimentUserInfoResult = new SyncQuickExperimentUserInfoResult(A0c.build(), str2, A0I, A0I2, A0P, A0P2);
                    }
                }
                A0s.add(syncQuickExperimentUserInfoResult);
            }
            return new SyncMultiQuickExperimentUserInfoResult(A0s);
        } catch (2L0 e) {
            if (!this.A01) {
                1Ql edit2 = this.A04.edit();
                edit2.CaL(A05, "");
                edit2.commit();
            }
            throw e;
        }
    }
}
