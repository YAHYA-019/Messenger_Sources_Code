package X;

import com.facebook.android.maps.model.LatLng;
import com.facebook.android.maps.model.LatLngBounds;

/* loaded from: KtZ.class */
public final class KtZ {
    public final LatLng A00;
    public final LatLng A01;
    public final LatLng A02;
    public final LatLng A03;
    public final LatLngBounds A04;

    public KtZ(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.A02 = latLng;
        this.A03 = latLng2;
        this.A00 = latLng3;
        this.A01 = latLng4;
        this.A04 = latLngBounds;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof KtZ)) {
                return false;
            }
            KtZ ktZ = (KtZ) obj;
            LatLng latLng = this.A02;
            LatLng latLng2 = ktZ.A02;
            if (latLng != null ? latLng.equals(latLng2) : latLng2 == null) {
                LatLng latLng3 = this.A03;
                LatLng latLng4 = ktZ.A03;
                if (latLng3 != null ? latLng3.equals(latLng4) : latLng4 == null) {
                    LatLng latLng5 = this.A00;
                    LatLng latLng6 = ktZ.A00;
                    if (latLng5 != null ? latLng5.equals(latLng6) : latLng6 == null) {
                        LatLng latLng7 = this.A01;
                        LatLng latLng8 = ktZ.A01;
                        if (latLng7 != null ? latLng7.equals(latLng8) : latLng8 == null) {
                            LatLngBounds latLngBounds = this.A04;
                            LatLngBounds latLngBounds2 = ktZ.A04;
                            if (latLngBounds == null) {
                                if (latLngBounds2 == null) {
                                    return true;
                                }
                            } else if (latLngBounds.equals(latLngBounds2)) {
                                return true;
                            }
                        }
                    }
                }
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((AbstractC2326GOr.A03(AnonymousClass002.A04(this.A02)) + AnonymousClass002.A04(this.A03)) * 31) + AnonymousClass002.A04(this.A00)) * 31) + AnonymousClass002.A04(this.A01)) * 31) + JQz.A0E(this.A04, 0);
    }

    public String toString() {
        StringBuilder A10 = JR1.A10(this);
        A10.append("{nearLeft=");
        A10.append(this.A02);
        A10.append(", nearRight=");
        A10.append(this.A03);
        A10.append(", farLeft=");
        A10.append(this.A00);
        A10.append(", farRight=");
        A10.append(this.A01);
        A10.append(", latLngBounds=");
        return AbstractC2327GOs.A0U(this.A04, A10);
    }
}
