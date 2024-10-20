package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.contacts.graphql.Contact;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: C8w.class */
public final class C8w {
    public final C01s A00;
    public final CCW A01;
    public final java.util.Map A02;

    public C8w() {
        CCW ccw = (CCW) 1Bn.A0A(83017);
        C01s A0I = 1BL.A0I();
        this.A02 = AnonymousClass001.A0u();
        this.A01 = ccw;
        this.A00 = A0I;
    }

    public Contact A00(String str) {
        java.util.Map map = this.A02;
        if (!map.containsKey(str)) {
            if (str == null) {
                return null;
            }
            A02(ImmutableList.of((Object) str));
        }
        return (Contact) map.get(str);
    }

    public 2JX A01(String str) {
        Contact A00 = A00(str);
        if (A00 == null) {
            return null;
        }
        6As A01 = 2JX.A01();
        A01.setString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        A01.A0B("is_messenger_user", A00.mIsMessengerUser);
        A01.setString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A00.mName.A00());
        return A01.getResult(2JX.class, 684260477);
    }

    public void A02(ImmutableList immutableList) {
        1Hz A10 = AbF.A10();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            A10.A05(1BK.A0X(AnonymousClass001.A0i(it)));
        }
        CCW ccw = this.A01;
        ImmutableSet A07 = A10.A07();
        1He r0 = 1He.A05;
        11T.A0F(A07, 0);
        1IB A00 = CCW.A00(ccw, r0, A07, true);
        D3I d3i = new D3I(0);
        A00.getClass();
        try {
            1Du it2 = ((ImmutableCollection) new D4r(d3i, A00).get(30, TimeUnit.SECONDS)).iterator();
            while (it2.hasNext()) {
                Contact contact = (Contact) it2.next();
                this.A02.put(contact.mProfileFbid, contact);
            }
        } catch (InterruptedException e) {
            this.A00.softReport("DbPaymentsUtil", "InterruptedException raised while waiting for contact fetching futures to return.", e);
        } catch (ExecutionException e2) {
            0fH.A0r("DbPaymentsUtil", "Got execution exception while fetching contacts", e2);
        } catch (TimeoutException unused) {
        }
    }
}
