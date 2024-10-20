package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import com.facebook.acra.constants.ActionId;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebook.resources.ui.FbButton;
import com.facebook.ui.search.SearchEditText;
import com.facebook.widget.listview.BetterListView;
import com.google.common.collect.ImmutableList;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;

/* renamed from: X.Den, reason: case insensitive filesystem */
/* loaded from: Den.class */
public final class C2134Den extends FIU {
    public View A00;
    public ArrayAdapter A01;
    public FbButton A02;
    public SearchEditText A03;
    public GGY A04;
    public BetterListView A05;
    public ImmutableList A06;
    public Locale A07;
    public Fz7[] A08;
    public final 1GS A09;
    public final PhoneNumberUtil A0A;
    public final boolean A0B;

    /* JADX WARN: Multi-variable type inference failed */
    public C2134Den(Context context, ImmutableList immutableList, boolean z) {
        super(context, AbJ.A00(5YG.A04(context) ? 1 : 0));
        this.A09 = DKG.A0J();
        this.A0A = (PhoneNumberUtil) 1Bi.A03(100133);
        this.A0B = z;
        this.A06 = (immutableList == null || immutableList.size() == 0) ? ImmutableList.copyOf(Locale.getISOCountries()) : ImmutableList.copyOf((Collection) immutableList);
        A0G(" ");
        View inflate = LayoutInflater.from(((FIU) this).A0F).inflate(2132541785, ((FIU) this).A0I);
        this.A00 = inflate;
        this.A03 = (SearchEditText) inflate.requireViewById(2131363418);
        this.A05 = (BetterListView) this.A00.requireViewById(2131363416);
        this.A02 = (FbButton) this.A00.requireViewById(2131362859);
        this.A03.requestFocus();
        this.A04 = new FsK(this, 4);
        this.A07 = this.A09.A05();
        ArrayList A0s = AnonymousClass001.A0s();
        1Du it = this.A06.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            int countryCodeForRegion = this.A0A.getCountryCodeForRegion(A0i);
            if (countryCodeForRegion != 0) {
                Collator collator = Fz7.A04;
                A0s.add(new Fz7(A0i, 0Pz.A0T("+", countryCodeForRegion), new Locale(this.A07.getLanguage(), A0i).getDisplayCountry(this.A07)));
            }
        }
        Collections.sort(A0s);
        Fz7[] fz7Arr = (Fz7[]) A0s.toArray(new Fz7[0]);
        this.A08 = fz7Arr;
        Q0q q0q = new Q0q(((FIU) this).A0F, this, fz7Arr);
        this.A01 = q0q;
        this.A05.setAdapter((ListAdapter) q0q);
        this.A05.setOnItemClickListener(new FYO(this, 6));
        FWn.A00(this.A03, this, 39);
        FXq.A01(this.A02, this, ActionId.MQTT_CONNECTED);
        ((FIU) this).A0I.getLayoutParams().height = -1;
        ((FIU) this).A0E = 1003;
    }

    public void A06() {
        7zR.A12(this.A03, AbI.A06(((FIU) this).A0F));
        super.A06();
    }
}
