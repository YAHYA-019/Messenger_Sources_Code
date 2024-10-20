package X;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

/* renamed from: X.0kt, reason: invalid class name */
/* loaded from: 0kt.class */
public abstract class C0kt extends Fragment {
    public static final String __redex_internal_original_name = "ListFragment";
    public View A00;
    public View A01;
    public View A02;
    public ListAdapter A03;
    public ListView A04;
    public TextView A05;
    public boolean A06;
    public final Handler A07 = new Handler();
    public final Runnable A09 = new 0UC(this);
    public final AdapterView.OnItemClickListener A08 = new 0UD(this);

    private void A01() {
        int i;
        View view;
        int i2;
        if (this.A04 == null) {
            View view2 = getView();
            if (view2 == null) {
                throw AnonymousClass001.A0N("Content view not yet created");
            }
            if (view2 instanceof ListView) {
                this.A04 = (ListView) view2;
            } else {
                TextView textView = (TextView) view2.findViewById(16711681);
                this.A05 = textView;
                if (textView == null) {
                    this.A00 = view2.findViewById(R.id.empty);
                } else {
                    textView.setVisibility(8);
                }
                this.A02 = view2.findViewById(16711682);
                this.A01 = view2.findViewById(16711683);
                View findViewById = view2.findViewById(R.id.list);
                if (!(findViewById instanceof ListView)) {
                    if (findViewById != null) {
                        throw AnonymousClass001.A0T("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                    throw AnonymousClass001.A0T("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                }
                ListView listView = (ListView) findViewById;
                this.A04 = listView;
                View view3 = this.A00;
                if (view3 != null) {
                    listView.setEmptyView(view3);
                }
            }
            this.A06 = true;
            this.A04.setOnItemClickListener(this.A08);
            ListAdapter listAdapter = this.A03;
            if (listAdapter == null) {
                if (this.A02 != null) {
                    i = 0;
                    A01();
                    view = this.A02;
                    if (view == null) {
                        throw AnonymousClass001.A0N("Can't be used with a custom content view");
                    }
                    if (this.A06) {
                        this.A06 = false;
                        i2 = 8;
                        view.clearAnimation();
                        this.A01.clearAnimation();
                    }
                }
                this.A07.post(this.A09);
            }
            this.A03 = null;
            boolean z = false;
            this.A03 = listAdapter;
            ListView listView2 = this.A04;
            if (listView2 != null) {
                listView2.setAdapter(listAdapter);
                if (!this.A06) {
                    if (requireView().getWindowToken() != null) {
                        z = true;
                    }
                    A01();
                    view = this.A02;
                    if (view == null) {
                        throw AnonymousClass001.A0N("Can't be used with a custom content view");
                    }
                    if (!this.A06) {
                        this.A06 = true;
                        i = 8;
                        i2 = 0;
                        if (z) {
                            view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                            this.A01.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
                        }
                        view.clearAnimation();
                        this.A01.clearAnimation();
                    }
                }
            }
            this.A07.post(this.A09);
            this.A02.setVisibility(i);
            this.A01.setVisibility(i2);
            this.A07.post(this.A09);
        }
    }

    public void A07(View view, ListView listView, int i, long j) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        int A02 = 0FI.A02(389730494);
        this.A07.removeCallbacks(this.A09);
        this.A04 = null;
        this.A06 = false;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A05 = null;
        super.onDestroyView();
        0FI.A08(749372918, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        A01();
    }
}
