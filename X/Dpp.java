package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.google.common.collect.ImmutableMap;

/* loaded from: Dpp.class */
public abstract class Dpp extends DRr implements 1lN {
    public static final String __redex_internal_original_name = "ZeroDialogFragment";
    public EMn A00;
    public C67K A01;
    public Object A02;
    public String A03;
    public Evr A04;
    public String A05;
    public String A06;
    public String A07;

    public static Bundle A08(EMn eMn, Object obj, String str, String str2, String str3) {
        Bundle A05 = 1BK.A05();
        A05.putSerializable("dialogName", str);
        A05.putSerializable("dialogState", eMn);
        A05.putString("dialogTitle", str2);
        A05.putString("dialogContent", str3);
        if (obj != null) {
            if (obj instanceof C23u) {
                A05.putBoolean("dialogExtraDataGQLModel", true);
                FJ8.A08(A05, (C23u) obj, "dialogExtraData");
            } else if (obj instanceof Parcelable) {
                A05.putParcelable("dialogExtraData", (Parcelable) obj);
                return A05;
            }
        }
        return A05;
    }

    private void A09(String str, String str2) {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.put("dialogName", this.A03);
        builder.put("dialogState", this.A00.toString());
        if (str2 != null) {
            builder.put("tracking_codes", str2);
        }
        Evr evr = this.A04;
        FES fes = this instanceof Dpo ? FES.A02 : FES.A03;
        String str3 = this.A07;
        ImmutableMap build = builder.build();
        4YV.A1N(fes, str3);
        11T.A0F(build, 4);
        2Jy A0G = DKH.A0G("button");
        A0G.A0D(1BJ.A00(10), str3);
        A0G.A0D(1BJ.A00(51), str);
        2Jy.A03(A0G, build, false);
        String str4 = fes.A01;
        if (str4 != null) {
            A0G.A0D("pigeon_reserved_keyword_module", str4);
        }
        DU3.A00(AbI.A08(evr.A00)).A03(A0G);
    }

    public Dialog A0n(Bundle bundle) {
        Dialog A0n = super.A0n(bundle);
        A0n.setOnKeyListener(new FKF(this, 2));
        String str = ((this instanceof Dpn) || !(this instanceof Dpo)) ? "zero_extra_charges_dialog_open" : "upsell_dialog_open";
        Object obj = this.A02;
        A09(str, obj instanceof Intent ? ((Intent) obj).getStringExtra("tracking_codes") : null);
        return A0n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A17() {
        String str = ((this instanceof Dpn) || !(this instanceof Dpo)) ? "zero_extra_charges_dialog_cancel" : "upsell_dialog_cancel";
        Object obj = this.A02;
        A09(str, obj instanceof Intent ? ((Intent) obj).getStringExtra("tracking_codes") : null);
        this.A01.A01(new C7v4(this.A00, QoF.A01, this.A02, this.A03));
        A16();
        C5fi.A00(DKH.A07((Fragment) this));
    }

    public void A18() {
        String str = ((this instanceof Dpn) || !(this instanceof Dpo)) ? "zero_extra_charges_dialog_confirm" : "upsell_dialog_confirm";
        Object obj = this.A02;
        A09(str, obj instanceof Intent ? ((Intent) obj).getStringExtra("tracking_codes") : null);
        this.A01.A01(new C7v4(this.A00, QoF.A02, this.A02, this.A03));
        A16();
    }

    public String AWg() {
        String str = (this instanceof Dpo ? FES.A02 : FES.A03).A01;
        str.getClass();
        return str;
    }

    public Long Am7() {
        return null;
    }

    public void onCancel(DialogInterface dialogInterface) {
        A17();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-166974993);
        super.onCreate(bundle);
        this.A04 = DKG.A0X();
        this.A01 = (C67K) 1Bi.A03(49962);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A03 = (String) bundle2.getSerializable("dialogName");
            this.A00 = bundle2.getSerializable("dialogState");
            this.A06 = bundle2.getString("dialogTitle");
            this.A05 = bundle2.getString("dialogContent");
            this.A02 = bundle2.getBoolean("dialogExtraDataGQLModel", false) ? FJ8.A03(bundle2, "dialogExtraData") : bundle2.getParcelable("dialogExtraData");
        }
        this.A07 = bundle != null ? bundle.getString("uuid") : 1BK.A0t();
        0FI.A08(220585886, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*X.0D2*/.onSaveInstanceState(bundle);
        bundle.putString("uuid", this.A07);
    }
}
