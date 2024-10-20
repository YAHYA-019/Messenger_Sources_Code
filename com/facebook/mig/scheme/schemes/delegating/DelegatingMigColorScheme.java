package com.facebook.mig.scheme.schemes.delegating;

import X.11T;
import X.2qR;
import X.C1p7;
import X.C1p8;
import X.C4Ny;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.highlightstab.immersivecolorschemes.HTImmersiveFixedColorScheme;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: DelegatingMigColorScheme.class */
public class DelegatingMigColorScheme implements MigColorScheme {
    public static final Parcelable.Creator CREATOR = new C4Ny(40);
    public final MigColorScheme A00;

    public DelegatingMigColorScheme(MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 1);
        this.A00 = migColorScheme;
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AUy() {
        return this.A00.AUy();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AUz() {
        return this.A00.AUz();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AVS() {
        return this.A00.AVS();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AVT() {
        return this.A00.AVT();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AVa() {
        return this.A00.AVa();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AWT() {
        return this.A00.AWT();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AX9() {
        if (this instanceof HTImmersiveFixedColorScheme) {
            return -1;
        }
        return this.A00.AX9();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AYp() {
        return this.A00.AYp();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AYu() {
        return this.A00.AYu();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AYv() {
        return this.A00.AYv();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AYw() {
        return this.A00.AYw();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AYx() {
        return this.A00.AYx();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AYy() {
        return this.A00.AYy();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AYz() {
        return this.A00.AYz();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AZL() {
        return this.A00.AZL();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AZM() {
        return this.A00.AZM();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AZN() {
        return this.A00.AZN();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AZO() {
        return this.A00.AZO();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AZP() {
        return this.A00.AZP();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AZc() {
        return this.A00.AZc();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AZd() {
        return this.A00.AZd();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AZe() {
        return this.A00.AZe();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AZw() {
        return this.A00.AZw();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Aa5() {
        return this.A00.Aa5();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Abp() {
        if (this instanceof HTImmersiveFixedColorScheme) {
            return 0;
        }
        return this.A00.Abp();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AcY() {
        return this.A00.AcY();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Aed() {
        return this.A00.Aed();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Agn() {
        return this.A00.Agn();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Ah8() {
        return this.A00.Ah8();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AhH() {
        return this.A00.AhH();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Ahd() {
        return this.A00.Ahd();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Ahe() {
        return this.A00.Ahe();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Aho() {
        return this.A00.Aho();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Ahs() {
        return this.A00.Ahs();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Aht() {
        return this.A00.Aht();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Ahu() {
        return this.A00.Ahu();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Ahv() {
        return this.A00.Ahv();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AjA(Integer num) {
        11T.A0F(num, 0);
        return this.A00.AjA(num);
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AjC() {
        return this.A00.AjC();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AjN() {
        return this.A00.AjN();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AkX() {
        return this.A00.AkX();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AmV() {
        return this.A00.AmV();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Amg() {
        return this.A00.Amg();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Amh() {
        return this.A00.Amh();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Ami() {
        return this.A00.Ami();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Amj() {
        return this.A00.Amj();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Amk() {
        return this.A00.Amk();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AoC() {
        return this.A00.AoC();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AoT() {
        return this.A00.AoT();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int ApO() {
        return this.A00.ApO();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AqM() {
        return this instanceof HTImmersiveFixedColorScheme ? Color.parseColor("#66FFFFFF") : this.A00.AqM();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Atn() {
        return this.A00.Atn();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Atp() {
        return this.A00.Atp();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Atv() {
        return this.A00.Atv();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int AvJ() {
        return this.A00.AvJ();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Awo() {
        if (this instanceof HTImmersiveFixedColorScheme) {
            return -1;
        }
        return this.A00.Awo();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Ayp() {
        return this.A00.Ayp();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Azp() {
        return this.A00.Azp();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B0U() {
        return this.A00.B0U();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B2P() {
        return this.A00.B2P();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B36() {
        return this.A00.B36();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B4d() {
        return this.A00.B4d();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B4f() {
        return this.A00.B4f();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B4h() {
        return this.A00.B4h();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B4i() {
        if (this instanceof HTImmersiveFixedColorScheme) {
            return -1;
        }
        return this.A00.B4i();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B4j() {
        return this.A00.B4j();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B4k() {
        return this.A00.B4k();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B4n() {
        return this.A00.B4n();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B5V() {
        return this.A00.B5V();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B6L() {
        return this.A00.B6L();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B6T() {
        return this.A00.B6T();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B6U() {
        return this.A00.B6U();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B86() {
        return this.A00.B86();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B87() {
        return this.A00.B87();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B9A() {
        return this.A00.B9A();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B9I() {
        return this instanceof HTImmersiveFixedColorScheme ? this.A00.Chx(C1p7.A0A) : this.A00.B9I();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B9K() {
        return this.A00.B9K();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B9N() {
        return this.A00.B9N();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B9O() {
        if (this instanceof HTImmersiveFixedColorScheme) {
            return -1;
        }
        return this.A00.B9O();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B9Q() {
        if (this instanceof HTImmersiveFixedColorScheme) {
            return -1;
        }
        return this.A00.B9Q();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B9T() {
        return this.A00.B9T();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int B9e() {
        return this.A00.B9e();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int BBD() {
        return this.A00.BBD();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int BCL() {
        return this.A00.BCL();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int BDl() {
        if (this instanceof HTImmersiveFixedColorScheme) {
            return 0;
        }
        return this.A00.BDl();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int BEi() {
        return this.A00.BEi();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int BEj() {
        return this.A00.BEj();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int BFX() {
        return this.A00.BFX();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int BFY() {
        return this.A00.BFY();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int BGk() {
        return this.A00.BGk();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int BGl() {
        return this.A00.BGl();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int BIc() {
        return this.A00.BIc();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int BKf() {
        return this.A00.BKf();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int BKg() {
        return this.A00.BKg();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int BKh() {
        return this.A00.BKh();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int BL8() {
        return this.A00.BL8();
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public int Chx(C1p8 c1p8) {
        11T.A0F(c1p8, 0);
        return this.A00.Chx(c1p8);
    }

    @Override // com.facebook.mig.scheme.interfaces.MigColorScheme
    public Object Ci4(2qR r302) {
        11T.A0F(r302, 0);
        return this.A00.Ci4(r302);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }
}
