package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.graphql.enums.GraphQLEventCreationEntryPoint;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.io.Serializable;

/* loaded from: B4N.class */
public final class B4N extends AbstractC1551Al6 implements AaW, DF3 {
    public static final String __redex_internal_original_name = "EventExtensionFragment";
    public View A00;
    public GraphQLEventCreationEntryPoint A01;
    public 6Je A02;
    public ThreadKey A03;
    public Integer A04;
    public final 2S3 A05 = new 2S3(this, __redex_internal_original_name);
    public final boolean A07 = true;
    public final DGi A06 = new Civ(this);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1551Al6
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        Parcelable parcelable = requireArguments().getParcelable("arg_thread_key");
        if (parcelable == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A03 = (ThreadKey) parcelable;
        String string = requireArguments().getString("arg_event_thread_type");
        if (string == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A04 = R0e.A00(string);
        C0L c0l = (C0L) 7zO.A0m(this, 83315);
        Serializable serializable = requireArguments().getSerializable("arg_creation_entrypoint");
        11T.A0I(serializable, "null cannot be cast to non-null type com.facebook.graphql.enums.GraphQLEventCreationEntryPoint");
        GraphQLEventCreationEntryPoint graphQLEventCreationEntryPoint = (GraphQLEventCreationEntryPoint) serializable;
        this.A01 = graphQLEventCreationEntryPoint;
        long j = super.A00;
        if (graphQLEventCreationEntryPoint == null) {
            11T.A0L("eventCreationEntrypoint");
            throw 0Q8.createAndThrow();
        }
        c0l.A00(graphQLEventCreationEntryPoint == GraphQLEventCreationEntryPoint.A01 ? BOr.A0e : BOr.A0o, j);
    }

    public void BiL() {
    }

    public void BiM() {
    }

    public boolean Bkd() {
        View view = this.A00;
        if (view == null) {
            11T.A0L("containerView");
            throw 0Q8.createAndThrow();
        }
        C5fi.A01(view);
        String str = super.A04;
        if (str == null) {
            return false;
        }
        int hashCode = str.hashCode();
        String str2 = "location";
        if (hashCode == -4084754) {
            if (!str.equals("external_link")) {
                return false;
            }
            A1Z(str2);
            return true;
        }
        if (hashCode == 1557721666) {
            str2 = "details";
        } else if (hashCode != 1901043637) {
            return false;
        }
        if (!str.equals(str2)) {
            return false;
        }
        A1Z("create_event");
        return true;
    }

    public void BlA() {
    }

    public void CSS() {
        Bkd();
    }

    @Override // X.DF3
    public void CmU(6Je r302) {
        this.A02 = r302;
    }

    @Override // X.AbstractC1551Al6
    public void onAttachFragment(Fragment fragment) {
        11T.A0F(fragment, 0);
        super.onAttachFragment(fragment);
        boolean A1X = 7zL.A1X(super.A04, "create_event");
        6Je r0 = this.A02;
        if (r0 != null) {
            r0.Cvu(A1X);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-203100352);
        FrameLayout A08 = AbJ.A08(this);
        A08.setId(AbstractC1551Al6.A09);
        this.A00 = A08;
        0FI.A08(-34455700, A02);
        return A08;
    }

    @Override // X.AbstractC1551Al6
    public void onSaveInstanceState(Bundle bundle) {
        String str;
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        ThreadKey threadKey = this.A03;
        if (threadKey == null) {
            str = "threadKey";
        } else {
            bundle.putParcelable("arg_thread_key", threadKey);
            Integer num = this.A04;
            if (num != null) {
                bundle.putString("arg_event_thread_type", 1 - num.intValue() != 0 ? "PUBLIC_CHATS" : "COMMUNITY_MESSAGING");
                return;
            }
            str = "eventThreadType";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1551Al6
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            ThreadKey threadKey = (ThreadKey) bundle.getParcelable("arg_thread_key");
            if (threadKey != null) {
                this.A03 = threadKey;
            }
            String string = bundle.getString("arg_event_thread_type");
            if (string != null) {
                this.A04 = R0e.A00(string);
            }
        }
        BdU bdU = (BdU) 7zN.A0n(this, 1BM.A01(this), 83390);
        ThreadKey threadKey2 = this.A03;
        if (threadKey2 == null) {
            AbM.A17();
            throw 0Q8.createAndThrow();
        }
        1UG A08 = 1BK.A08(1Br.A02(bdU.A00), 4YT.A00(68));
        if (A08.isSampled()) {
            0DA r0 = new 0DA();
            r0.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID, 1BK.A0w(threadKey2));
            r0.A07("key", threadKey2.toString());
            r0.A01(EnumC03583yg.A08, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            A08.A5c(7NO.A02, "feature");
            AbF.A1K(r0, A08);
            4YU.A1I(A08, "stage", 14);
            A08.BZL();
        }
    }
}
