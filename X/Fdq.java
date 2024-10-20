package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Locale;

/* loaded from: Fdq.class */
public final class Fdq implements 1Tu, CallerContextable {
    public static final String __redex_internal_original_name = "QuickExperimentSyncServiceHandler";
    public final FhE A00;
    public final C4qy A01;
    public final C00i A02;
    public final C15h A03;

    public Fdq(Context context) {
        C4qy c4qy = (C4qy) 1Bi.A03(84632);
        FhE fhE = (FhE) 1Bn.A0A(99442);
        G7K A01 = G7K.A01(this, 2);
        1BV A0R = 7zL.A0R(context, 99440);
        this.A01 = c4qy;
        this.A00 = fhE;
        this.A03 = A01;
        this.A02 = A0R;
    }

    public OperationResult BMQ(1TC r302) {
        boolean z;
        Object obj;
        1Ql edit;
        1G2 r310;
        List A0s;
        String join;
        String str = r302.A06;
        if ("sync_qe".equals(str)) {
            z = false;
        } else {
            if (!1BJ.A00(2064).equals(str)) {
                if (!"log_to_qe".equals(str)) {
                    throw 0Pz.A05(4YT.A00(246), str);
                }
                ((1Rl) this.A03.get()).A08(r302.A02, this.A00, r302.A00.getParcelable("experiment_logging_params"));
                return OperationResult.A00;
            }
            z = true;
        }
        Eqv eqv = (Eqv) this.A02.get();
        Bundle bundle = r302.A00;
        bundle.getInt("chunk_count");
        bundle.getInt("chunk_number");
        1BY r0 = eqv.A00;
        1EZ r02 = (1EZ) 1Bn.A0E((Context) null, r0, 16428);
        Object A04 = 1Lo.A04((Context) null, 1Fw.A04(r02), r0, 85214);
        boolean z2 = true;
        if (z) {
            if (eqv.A03.A02() == null) {
                z2 = false;
            }
            obj = "Device Id must be available";
        } else {
            if (1Fw.A04(r02).A02.equals(ConstantsKt.CAMERA_ID_FRONT) || A04 == null) {
                z2 = false;
            }
            obj = "UID an UID Hash must be available";
        }
        Preconditions.checkState(z2, obj);
        if (z) {
            1G2 r03 = RDH.A01;
            r310 = RDH.A00;
            edit = eqv.A06.edit();
            edit.CaH(r03, eqv.A02.now());
            join = Locale.getDefault().toString();
        } else {
            C00i c00i = eqv.A05;
            1LF r04 = (1LF) ((F4g) c00i.get()).A00.get();
            1G9 r05 = 1G0.A0B;
            1G2 A05 = r04.A05(r05, "config/qe/last_fetch_time_ms", true);
            1G2 A052 = ((1LF) ((F4g) c00i.get()).A00.get()).A05(r05, "config/qe/last_fetch_locale", true);
            FbSharedPreferences fbSharedPreferences = eqv.A06;
            1Ql edit2 = fbSharedPreferences.edit();
            edit2.CaH(A05, eqv.A02.now());
            edit2.CaL(A052, Locale.getDefault().toString());
            edit2.commit();
            edit = fbSharedPreferences.edit();
            r310 = F4g.A02;
            Eh9 eh9 = eqv.A01;
            if (1BL.A1a(eh9.A01)) {
                String A3a = eh9.A00.A3a(r310, "");
                if (A3a.equals("")) {
                    A0s = AbF.A1F();
                } else {
                    Splitter.AnonymousClass5 anonymousClass5 = new Splitter.AnonymousClass5(A3a);
                    A0s = AbF.A1F();
                    2Ri.A0H(anonymousClass5, A0s);
                }
            } else {
                A0s = AnonymousClass001.A0s();
            }
            Preconditions.checkArgument(DKD.A1V(A0s.size(), 5), "Too many UIDs were initially stored in the system.");
            if (A0s instanceof ImmutableList) {
                A0s = 1JW.A02(A0s);
            }
            A0s.remove(A04);
            if (A0s.size() >= 5) {
                A0s = A0s.subList(0, 4);
            }
            A0s.add(0, A04);
            join = new Joiner(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).join(A0s.iterator());
        }
        edit.CaL(r310, join);
        edit.commit();
        ImmutableList.builder();
        eqv.A04.get();
        if (z) {
            throw AnonymousClass001.A0Q("getSessionlessExperimentNames");
        }
        throw AnonymousClass001.A0Q("getSessionedExperimentNames");
    }
}
