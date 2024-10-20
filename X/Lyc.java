package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashSet;

/* loaded from: Lyc.class */
public final class Lyc extends HashSet {
    public final /* synthetic */ L4p this$0;

    public Lyc(L4p l4p) {
        this.this$0 = l4p;
        C00i c00i = l4p.A01;
        add(((Koh) c00i.get()).A00().A0D(PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
        add(((Koh) c00i.get()).A00().A0D("address"));
        add(((Koh) c00i.get()).A00().A0D("telephone"));
        add(((Koh) c00i.get()).A00().A0D("email"));
    }
}
