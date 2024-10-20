package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import java.util.BitSet;

/* renamed from: X.8S9, reason: invalid class name */
/* loaded from: 8S9.class */
public final class C8S9 extends C1rs {
    public 1Iw A00;
    public C8n1 A01;
    public final BitSet A02;
    public final String[] A03;

    public C8S9(1Iw r302, C8n1 c8n1) {
        super(c8n1, r302, 0, 0);
        this.A03 = new String[]{"emojiCircleSize", "emojiHorizontalPadding", "emojiTopPadding", "isViewer", "itemPrimaryTextColor", "itemSecondaryTextColor", "listItemVerticalPadding", PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "reaction", "reactorNameTextSize", TraceFieldType.Uri};
        BitSet A18 = 1BK.A18(11);
        this.A02 = A18;
        this.A01 = c8n1;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A1A(this, this.A02, this.A03);
        return this.A01;
    }
}
