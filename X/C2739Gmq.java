package X;

import com.facebook.messaging.composer.params.ComposerInitParamsSpec$ComposerLaunchSource;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* renamed from: X.Gmq, reason: case insensitive filesystem */
/* loaded from: Gmq.class */
public final class C2739Gmq extends IV9 {
    public C1yg A00;
    public String A01;
    public final C00i A02 = 1BV.A00(83389);

    public void C3C(ParcelableSecondaryData parcelableSecondaryData) {
        EnumC03583yg enumC03583yg;
        if (this.A01 == null) {
            this.A01 = 7zR.A0s();
        }
        BdT bdT = (BdT) this.A02.get();
        String str = this.A01;
        ComposerInitParamsSpec$ComposerLaunchSource composerInitParamsSpec$ComposerLaunchSource = ((IV9) this).A01;
        boolean A1V = GOo.A1V(((IV9) this).A00);
        C1yg c1yg = this.A00;
        11T.A0F(str, 0);
        1UG A08 = 1BK.A08(1Br.A02(bdT.A00), 4YT.A00(401));
        if (A08.isSampled()) {
            GOn.A1Q(A08, str);
            4YU.A1I(A08, "major_entry_point", HvN.A00(composerInitParamsSpec$ComposerLaunchSource));
            4YU.A1I(A08, "minor_entry_point", 0);
            A08.A5H("is_chathead", Boolean.valueOf(A1V));
            if (c1yg != null) {
                int ordinal = c1yg.ordinal();
                if (ordinal == 13) {
                    enumC03583yg = EnumC03583yg.A03;
                } else if (ordinal == 14) {
                    enumC03583yg = EnumC03583yg.A02;
                } else if (ordinal == 0) {
                    enumC03583yg = EnumC03583yg.A0G;
                } else if (ordinal == 1) {
                    enumC03583yg = EnumC03583yg.A0D;
                } else if (ordinal == 23) {
                    enumC03583yg = EnumC03583yg.A0E;
                }
                A08.A5c(enumC03583yg, "thread_type");
                A08.BZL();
            }
            enumC03583yg = EnumC03583yg.A0M;
            A08.A5c(enumC03583yg, "thread_type");
            A08.BZL();
        }
    }
}
