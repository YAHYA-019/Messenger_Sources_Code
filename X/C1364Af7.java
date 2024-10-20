package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.contacts.graphql.Contact;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import java.util.List;

/* renamed from: X.Af7, reason: case insensitive filesystem */
/* loaded from: Af7.class */
public final class C1364Af7 extends BaseAdapter implements Filterable, CallerContextable, DE3 {
    public static final CallerContext A03 = CallerContext.A06(C1364Af7.class);
    public static final String __redex_internal_original_name = "MessageRecipientTypeaheadAdapter";
    public final AfD A00;
    public final List A01;
    public final Context A02;

    public C1364Af7() {
        Context A0J = 7zP.A0J();
        AfD afD = (AfD) 1Bn.A0B(84820);
        this.A00 = afD;
        afD.A00 = this;
        this.A02 = A0J;
        this.A01 = AnonymousClass001.A0s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.A01.size();
    }

    @Override // android.widget.Filterable
    public /* bridge */ /* synthetic */ Filter getFilter() {
        return this.A00;
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A01.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return (int) Long.parseLong(((Contact) this.A01.get(i)).mProfileFbid);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.facebook.drawee.fbpipeline.FbDraweeView, android.view.View] */
    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        if (view == null) {
            view = AbG.A08(LayoutInflater.from(this.A02), viewGroup, 2132542553);
        }
        Contact contact = (Contact) this.A01.get(i);
        ?? r0 = (FbDraweeView) view.requireViewById(2131364245);
        String str = contact.mSmallPictureUrl;
        if (str != null) {
            r0.A0G(C0A2.A03(str), A03);
            i2 = 0;
        } else {
            i2 = 4;
        }
        r0.setVisibility(i2);
        if (contact.mSmallPictureUrl == null) {
            r0.A0G(null, A03);
        }
        ((TextView) view.requireViewById(2131364242)).setText(contact.mName.A00());
        return view;
    }
}
