package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.xapp.messaging.contentsearch.messengerexternalmedia.model.MessengerExternalMediaResource;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* renamed from: X.8ma, reason: invalid class name */
/* loaded from: 8ma.class */
public final class C8ma extends C1rj {
    public int A00;
    public FbUserSession A01;
    public 5BK A02;
    public AXE A03;
    public boolean A04;

    public C8ma() {
        super("MessengerExternalMediaItemComponent");
        this.A00 = -1;
    }

    public static final Integer A00(MessengerExternalMediaResource messengerExternalMediaResource) {
        ImmutableList immutableList;
        MediaResource mediaResource;
        if (messengerExternalMediaResource == null || (immutableList = messengerExternalMediaResource.A02) == null || (mediaResource = (MediaResource) 0QD.A0E(immutableList)) == null) {
            return 0S2.A0C;
        }
        5HP r0 = mediaResource.A0Q;
        if (r0 != null) {
            7mA r02 = 7mA.$redex_init_class;
            int ordinal = r0.ordinal();
            if (ordinal == 1 || ordinal == 7) {
                return 0S2.A00;
            }
            if (ordinal == 0 || ordinal == 5) {
                return 0S2.A01;
            }
        }
        0fH.A0o("MessengerExternalMediaResourceSpec.TypeHelper", "received an unknown MessengerExternalMediaResource type");
        return 0S2.A0C;
    }

    public final Object[] A0k() {
        return 7zU.A1b(this.A01, this.A02, Boolean.valueOf(this.A04), this.A03, this.A00);
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String str;
        8Rq r311;
        8lD r312;
        BitSet bitSet;
        String[] strArr;
        FbUserSession fbUserSession = this.A01;
        AXE axe = this.A03;
        int i = this.A00;
        boolean z = this.A04;
        5BK r0 = this.A02;
        if (!(axe instanceof A6v)) {
            if (axe instanceof MessengerExternalMediaResource) {
                MessengerExternalMediaResource messengerExternalMediaResource = (MessengerExternalMediaResource) axe;
                if (A00(messengerExternalMediaResource) == 0S2.A00) {
                    r311 = new 8Rr(r302, new 8kH());
                    r312 = ((8Rr) r311).A01;
                    ((8kH) r312).A00 = fbUserSession;
                    bitSet = ((8Rr) r311).A02;
                    bitSet.set(0);
                    ((8kH) r312).A01 = messengerExternalMediaResource;
                    bitSet.set(1);
                    r311.A1J(2131954914);
                    strArr = ((8Rr) r311).A03;
                } else {
                    if (A00(messengerExternalMediaResource) == 0S2.A01) {
                        r311 = new 8Rp(r302, new 8nC());
                        r312 = ((8Rp) r311).A01;
                        ((8nC) r312).A02 = messengerExternalMediaResource;
                        BitSet bitSet2 = ((8Rp) r311).A02;
                        bitSet2.set(0);
                        ((8nC) r312).A03 = z;
                        r311.A1J(2131954914);
                        ((8nC) r312).A01 = r0;
                        if (i != -1) {
                            ((8nC) r312).A00 = i;
                        }
                        C1rs.A01(bitSet2, ((8Rp) r311).A03);
                        r311.A0J();
                        return r312;
                    }
                    str = "Received a MediaResource that is not a video or image";
                }
            } else {
                str = "Received an unsupported media type";
            }
            0fH.A0o("MessengerExternalMediaItemComponentSpec", str);
            return 2cK.A01(r302, (String) null, 0).A00;
        }
        r311 = new 8Rq(r302, new 8lD());
        r312 = r311.A01;
        r312.A01 = (A6v) axe;
        bitSet = r311.A02;
        bitSet.set(0);
        r312.A00 = i;
        bitSet.set(1);
        r311.A1J(2131966307);
        strArr = r311.A03;
        C1rs.A00(bitSet, strArr);
        r311.A0J();
        return r312;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }
}
