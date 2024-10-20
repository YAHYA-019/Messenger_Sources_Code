package X;

import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import java.util.List;

/* loaded from: Kqn.class */
public final class Kqn {
    public AttestationConveyancePreference A00;
    public AuthenticationExtensions A01;
    public AuthenticatorSelectionCriteria A02;
    public PublicKeyCredentialRpEntity A03;
    public PublicKeyCredentialUserEntity A04;
    public Double A05;
    public List A06;
    public List A07;
    public byte[] A08;

    public PublicKeyCredentialCreationOptions A00() {
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.A03;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.A04;
        byte[] bArr = this.A08;
        List list = this.A06;
        Double d = this.A05;
        List list2 = this.A07;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.A02;
        AttestationConveyancePreference attestationConveyancePreference = this.A00;
        return new PublicKeyCredentialCreationOptions(null, this.A01, authenticatorSelectionCriteria, publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, null, d, null, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), null, list, list2, bArr);
    }
}
