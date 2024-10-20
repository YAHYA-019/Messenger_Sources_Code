package com.facebook.messaging.wellbeing.selfremediation.globalblock.redesign;

import X.0FI;
import X.1BK;
import X.1BV;
import X.1Bn;
import X.1iF;
import X.1pK;
import X.1tC;
import X.4LS;
import X.4YU;
import X.5PC;
import X.7zL;
import X.7zR;
import X.7zU;
import X.AbF;
import X.AbI;
import X.AbL;
import X.AbN;
import X.AlL;
import X.BL3;
import X.BLn;
import X.ByI;
import X.C00i;
import X.C06c;
import X.C1548Al1;
import X.C1F6;
import X.C1rs;
import X.C5xv;
import X.C5ya;
import X.DEJ;
import X.DEP;
import X.QDY;
import X.QIm;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import com.facebook.messaging.neue.contactpicker.ContactPickerParams;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.io.Serializable;
import java.util.BitSet;

/* loaded from: BlockPeoplePickerActivityV2.class */
public class BlockPeoplePickerActivityV2 extends FbFragmentActivity implements DEP {
    public C00i A00;
    public C00i A01;
    public C00i A02;
    public LithoView A03;
    public AlL A04;
    public ByI A05;
    public C00i A06;
    public C00i A07;
    public C00i A08;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbN.A0B();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        BLn bLn;
        boolean z;
        super.A2y(bundle);
        getWindow().getClass();
        setContentView(2132541753);
        View findViewById = findViewById(2131368249);
        if (findViewById != null && 5PC.A00((5PC) 4YU.A0p(this.A08)).AZk(36313823933766707L)) {
            findViewById.setVisibility(0);
            C06c A0D = 7zU.A0D(this);
            Intent intent = getIntent();
            Serializable serializableExtra = (!intent.hasExtra("block_people_type") || intent.getSerializableExtra("block_people_type") == null) ? BL3.A01 : intent.getSerializableExtra("block_people_type");
            1pK c1548Al1 = new C1548Al1();
            Bundle A05 = 1BK.A05();
            A05.putString("block_people_type", serializableExtra.toString());
            c1548Al1.setArguments(A05);
            A0D.A0M(c1548Al1, 2131368249);
            C06c.A00(A0D, true);
            return;
        }
        ((1tC) 4YU.A0p(this.A07)).A03(getWindow(), (MigColorScheme) 4YU.A0p(this.A02));
        ByI byI = this.A05;
        DEP dep = byI.A08;
        C5xv c5xv = byI.A09;
        4LS r0 = byI.A06;
        if (byI.A07 == BL3.A01) {
            bLn = BLn.A0N;
            z = true;
        } else {
            bLn = BLn.A0O;
            z = false;
        }
        ContactPickerParams contactPickerParams = new ContactPickerParams(bLn, null, null, false, true, ((C5ya) byI.A02.get()).A00(), false, false, false, false, z, true);
        DEJ dej = byI.A05;
        BlockPeoplePickerActivityV2 blockPeoplePickerActivityV2 = (BlockPeoplePickerActivityV2) dep;
        LithoView lithoView = (LithoView) blockPeoplePickerActivityV2.findViewById(2131363304);
        blockPeoplePickerActivityV2.A03 = lithoView;
        if (lithoView != null) {
            QDY qdy = new QDY(7zL.A0W(blockPeoplePickerActivityV2), new QIm());
            MigColorScheme migColorScheme = (MigColorScheme) 4YU.A0p(blockPeoplePickerActivityV2.A02);
            QIm qIm = qdy.A01;
            qIm.A01 = migColorScheme;
            BitSet bitSet = qdy.A02;
            bitSet.set(0);
            qIm.A00 = r0;
            bitSet.set(1);
            qIm.A02 = c5xv;
            bitSet.set(2);
            C1rs.A03(bitSet, qdy.A03);
            qdy.A0J();
            lithoView.A0x(qIm);
        }
        AlL A06 = AlL.A06(contactPickerParams);
        blockPeoplePickerActivityV2.A04 = A06;
        A06.A0Q = dej;
        C06c A0D2 = 7zU.A0D(blockPeoplePickerActivityV2);
        A0D2.A0L(blockPeoplePickerActivityV2.A04, 2131363303);
        C06c.A00(A0D2, false);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        super.A2z(bundle);
        this.A00 = AbF.A0Q(this, 100189);
        this.A02 = 7zL.A0R(this, 16979);
        this.A08 = 1BV.A00(82526);
        1BV A00 = 1BV.A00(459);
        this.A06 = A00;
        this.A01 = AbI.A0L();
        this.A07 = 1BV.A00(16838);
        C1F6 c1f6 = (C1F6) A00.get();
        Intent intent = getIntent();
        BL3 bl3 = (!intent.hasExtra("block_people_type") || intent.getSerializableExtra("block_people_type") == null) ? BL3.A01 : (BL3) intent.getSerializableExtra("block_people_type");
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            ByI byI = new ByI(bl3, this);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A05 = byI;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public boolean A36() {
        return true;
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int A00 = 0FI.A00(1347340955);
        super.onResume();
        if (this.A03 != null) {
            7zR.A12(this.A03, (InputMethodManager) 4YU.A0p(this.A00));
        }
        0FI.A07(-1187834047, A00);
    }
}
