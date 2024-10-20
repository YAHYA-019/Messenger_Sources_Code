package androidx.appcompat.widget;

import X.0FI;
import X.0Pz;
import X.1BK;
import X.4YU;
import X.4YV;
import X.53Y;
import X.53Z;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0Ad;
import X.DKC;
import X.DKD;
import X.DKG;
import X.DLW;
import X.FYa;
import X.GOn;
import X.GOo;
import X.GOp;
import X.JQx;
import X.JTi;
import X.JXX;
import X.JYX;
import X.Kuz;
import X.Kzx;
import X.LGb;
import X.LJj;
import X.LKO;
import X.LKQ;
import X.LKR;
import X.LKS;
import X.LL9;
import X.LLC;
import X.Ljf;
import X.Ljg;
import X.MB6;
import X.MDv;
import X.MHi;
import X.MHn;
import X.ViewOnClickListenerC3007Jg0;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.facebook.common.dextricks.Constants;
import com.mapbox.mapboxsdk.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: SearchView.class */
public class SearchView extends LinearLayoutCompat implements MHi {
    public static final boolean DBG = false;
    public static final String IME_OPTION_NO_MICROPHONE = "nm";
    public static final String LOG_TAG = "SearchView";
    public static final Kzx PRE_API_29_HIDDEN_METHOD_INVOKER;
    public Bundle mAppSearchData;
    public boolean mClearingFocus;
    public final ImageView mCloseButton;
    public final ImageView mCollapsedIcon;
    public int mCollapsedImeOptions;
    public final CharSequence mDefaultQueryHint;
    public final View mDropDownAnchor;
    public boolean mExpandedInActionView;
    public final ImageView mGoButton;
    public boolean mIconified;
    public boolean mIconifiedByDefault;
    public int mMaxWidth;
    public CharSequence mOldQueryText;
    public final View.OnClickListener mOnClickListener;
    public MDv mOnCloseListener;
    public final TextView.OnEditorActionListener mOnEditorActionListener;
    public final AdapterView.OnItemClickListener mOnItemClickListener;
    public final AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    public MHn mOnQueryChangeListener;
    public View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    public View.OnClickListener mOnSearchClickListener;
    public MB6 mOnSuggestionListener;
    public final WeakHashMap mOutsideDrawablesCache;
    public CharSequence mQueryHint;
    public boolean mQueryRefinement;
    public Runnable mReleaseCursorRunnable;
    public final ImageView mSearchButton;
    public final View mSearchEditFrame;
    public final Drawable mSearchHintIcon;
    public final View mSearchPlate;
    public final SearchAutoComplete mSearchSrcTextView;
    public Rect mSearchSrcTextViewBounds;
    public Rect mSearchSrtTextViewBoundsExpanded;
    public SearchableInfo mSearchable;
    public final View mSubmitArea;
    public boolean mSubmitButtonEnabled;
    public final int mSuggestionCommitIconResId;
    public final int mSuggestionRowLayout;
    public JYX mSuggestionsAdapter;
    public int[] mTemp;
    public int[] mTemp2;
    public View.OnKeyListener mTextKeyListener;
    public TextWatcher mTextWatcher;
    public JXX mTouchDelegate;
    public final Runnable mUpdateDrawableStateRunnable;
    public CharSequence mUserQuery;
    public final Intent mVoiceAppSearchIntent;
    public final ImageView mVoiceButton;
    public boolean mVoiceButtonEnabled;
    public final Intent mVoiceWebSearchIntent;

    /* loaded from: SearchView$SavedState.class */
    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new LGb(0);
        public boolean A00;

        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            AnonymousClass002.A0W(this, "SearchView.SavedState{", A0k);
            A0k.append(" isIconified=");
            return AbstractC2327GOs.A0X(A0k, this.A00);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.A00));
        }
    }

    /* loaded from: SearchView$SearchAutoComplete.class */
    public class SearchAutoComplete extends DLW {
        public SearchView A00;
        public boolean A01;
        public int A02;
        public final Runnable A03;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 2130968713);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.A03 = new Ljg(this);
            this.A02 = getThreshold();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void A00() {
            if (Build.VERSION.SDK_INT >= 29) {
                Kuz.A01(this);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            Kzx kzx = SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER;
            Kzx.A00();
            Method method = kzx.A02;
            if (method != null) {
                try {
                    method.invoke(this, true);
                } catch (Exception unused) {
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void A01(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.A01 = false;
                removeCallbacks(this.A03);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.A01 = true;
                    return;
                }
                this.A01 = false;
                removeCallbacks(this.A03);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
        
            if (super/*android.widget.AutoCompleteTextView*\/.enoughToFilter() != false) goto L6;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean enoughToFilter() {
            /*
                r301 = this;
                r0 = r301
                int r0 = r0.A02
                r302 = r0
                r0 = r302
                if (r0 <= 0) goto L14
                r0 = r301
                boolean r0 = super/*android.widget.AutoCompleteTextView*/.enoughToFilter()
                r303 = r0
                r0 = 0
                r302 = r0
                r0 = r303
                if (r0 == 0) goto L16
            L14:
                r0 = 1
                r302 = r0
            L16:
                r0 = r302
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.SearchAutoComplete.enoughToFilter():boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.A01) {
                Runnable runnable = this.A03;
                removeCallbacks(runnable);
                post(runnable);
            }
            return onCreateInputConnection;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0091, code lost:
        
            if (r0 >= 600) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0057, code lost:
        
            if (r0.orientation != 2) goto L8;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onFinishInflate() {
            /*
                r301 = this;
                r0 = -1147866047(0xffffffffbb94f441, float:-0.004545719)
                int r0 = X.0FI.A06(r0)
                r302 = r0
                r0 = r301
                androidx.appcompat.widget.SearchView.super.onFinishInflate()
                r0 = r301
                android.content.res.Resources r0 = r0.getResources()
                r303 = r0
                r0 = r303
                android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
                r304 = r0
                r0 = r303
                android.content.res.Configuration r0 = r0.getConfiguration()
                r305 = r0
                r0 = r305
                int r0 = r0.screenWidthDp
                r306 = r0
                r0 = r305
                int r0 = r0.screenHeightDp
                r307 = r0
                r0 = 960(0x3c0, float:1.345E-42)
                r308 = r0
                r0 = r306
                r1 = r308
                if (r0 < r1) goto L7f
                r0 = 720(0x2d0, float:1.009E-42)
                r308 = r0
                r0 = r307
                r1 = r308
                if (r0 < r1) goto L5a
                r0 = r305
                int r0 = r0.orientation
                r306 = r0
                r0 = 2
                r308 = r0
                r0 = 256(0x100, float:3.59E-43)
                r307 = r0
                r0 = 256(0x100, float:3.59E-43)
                r309 = r0
                r0 = r306
                r1 = r308
                if (r0 == r1) goto L63
            L5a:
                r0 = 192(0xc0, float:2.69E-43)
                r307 = r0
                r0 = 192(0xc0, float:2.69E-43)
                r309 = r0
            L63:
                r0 = r307
                float r0 = (float) r0
                r309 = r0
                r0 = 1
                r1 = r309
                r2 = r304
                float r0 = android.util.TypedValue.applyDimension(r0, r1, r2)
                int r0 = (int) r0
                r308 = r0
                r0 = r301
                r1 = r308
                r0.setMinWidth(r1)
                r0 = -1089760421(0xffffffffbf0b935b, float:-0.5452172)
                r1 = r302
                X.0FI.A0C(r0, r1)
                return
            L7f:
                r0 = 600(0x258, float:8.41E-43)
                r308 = r0
                r0 = 160(0xa0, float:2.24E-43)
                r307 = r0
                r0 = 160(0xa0, float:2.24E-43)
                r309 = r0
                r0 = r306
                r1 = r308
                if (r0 < r1) goto L63
                goto L5a
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.SearchAutoComplete.onFinishInflate():void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            int A06 = 0FI.A06(-1522809998);
            super/*android.widget.AutoCompleteTextView*/.onFocusChanged(z, i, rect);
            this.A00.onTextFocusChanged();
            0FI.A0C(1905687993, A06);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.A00.clearFocus();
                        A01(false);
                        return true;
                    }
                }
            }
            return super/*android.widget.AutoCompleteTextView*/.onKeyPreIme(i, keyEvent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onWindowFocusChanged(boolean z) {
            int A06 = 0FI.A06(1982325531);
            super/*android.widget.AutoCompleteTextView*/.onWindowFocusChanged(z);
            if (z && this.A00.hasFocus() && getVisibility() == 0) {
                this.A01 = true;
                if (SearchView.isLandscapeMode(getContext())) {
                    A00();
                }
            }
            0FI.A0C(1323365746, A06);
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void setThreshold(int i) {
            super/*android.widget.AutoCompleteTextView*/.setThreshold(i);
            this.A02 = i;
        }
    }

    static {
        PRE_API_29_HIDDEN_METHOD_INVOKER = Build.VERSION.SDK_INT < 29 ? new Kzx() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971591);
    }

    /* JADX WARN: Type inference failed for: r0v59, types: [androidx.appcompat.widget.SearchView$SearchAutoComplete, android.widget.TextView, android.view.View, android.widget.AutoCompleteTextView] */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSearchSrcTextViewBounds = DKC.A0C();
        this.mSearchSrtTextViewBoundsExpanded = DKC.A0C();
        this.mTemp = new int[2];
        this.mTemp2 = new int[2];
        this.mUpdateDrawableStateRunnable = new JTi(this);
        this.mReleaseCursorRunnable = new Ljf(this);
        this.mOutsideDrawablesCache = new WeakHashMap();
        View.OnClickListener A00 = LKO.A00(this, 1);
        this.mOnClickListener = A00;
        this.mTextKeyListener = new LKR(this, 0);
        FYa fYa = new FYa(this, 0);
        this.mOnEditorActionListener = fYa;
        LL9 ll9 = new LL9(this, 0);
        this.mOnItemClickListener = ll9;
        LLC llc = new LLC(this, 1);
        this.mOnItemSelectedListener = llc;
        this.mTextWatcher = new LJj(this, 0);
        int[] iArr = 53Y.A0K;
        53Z A0D = DKD.A0D(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = A0D.A02;
        C0Ad.A07(context, typedArray, attributeSet, this, iArr, i, 0);
        LayoutInflater.from(context).inflate(typedArray.getResourceId(9, 2132541461), (ViewGroup) this, true);
        ?? r0 = (SearchAutoComplete) findViewById(2131367189);
        this.mSearchSrcTextView = r0;
        r0.A00 = this;
        this.mSearchEditFrame = findViewById(2131367161);
        View findViewById = findViewById(2131367182);
        this.mSearchPlate = findViewById;
        View findViewById2 = findViewById(2131367710);
        this.mSubmitArea = findViewById2;
        ImageView A0I = GOn.A0I(this, 2131367152);
        this.mSearchButton = A0I;
        ImageView A0I2 = GOn.A0I(this, 2131367172);
        this.mGoButton = A0I2;
        ImageView A0I3 = GOn.A0I(this, 2131367153);
        this.mCloseButton = A0I3;
        ImageView A0I4 = GOn.A0I(this, 2131367194);
        this.mVoiceButton = A0I4;
        ImageView A0I5 = GOn.A0I(this, 2131367180);
        this.mCollapsedIcon = A0I5;
        findViewById.setBackground(A0D.A01(10));
        findViewById2.setBackground(A0D.A01(14));
        A0I.setImageDrawable(A0D.A01(13));
        A0I2.setImageDrawable(A0D.A01(7));
        A0I3.setImageDrawable(A0D.A01(4));
        A0I4.setImageDrawable(A0D.A01(16));
        A0I5.setImageDrawable(A0D.A01(13));
        this.mSearchHintIcon = A0D.A01(12);
        A0I.setTooltipText(getResources().getString(2131952115));
        this.mSuggestionRowLayout = typedArray.getResourceId(15, 2132541460);
        this.mSuggestionCommitIconResId = typedArray.getResourceId(5, 0);
        A0I.setOnClickListener(A00);
        A0I3.setOnClickListener(A00);
        A0I2.setOnClickListener(A00);
        A0I4.setOnClickListener(A00);
        r0.setOnClickListener(A00);
        r0.addTextChangedListener(this.mTextWatcher);
        r0.setOnEditorActionListener(fYa);
        r0.setOnItemClickListener(ll9);
        r0.setOnItemSelectedListener(llc);
        r0.setOnKeyListener(this.mTextKeyListener);
        r0.setOnFocusChangeListener(new LKQ(this, 0));
        setIconifiedByDefault(typedArray.getBoolean(8, true));
        int dimensionPixelSize = typedArray.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.mDefaultQueryHint = typedArray.getText(6);
        this.mQueryHint = typedArray.getText(11);
        int i2 = typedArray.getInt(3, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = typedArray.getInt(2, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(typedArray.getBoolean(0, true));
        typedArray.recycle();
        Intent A0A = 4YU.A0A("android.speech.action.WEB_SEARCH");
        this.mVoiceWebSearchIntent = A0A;
        A0A.addFlags(268435456);
        A0A.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent A0A2 = 4YU.A0A("android.speech.action.RECOGNIZE_SPEECH");
        this.mVoiceAppSearchIntent = A0A2;
        A0A2.addFlags(268435456);
        View findViewById3 = findViewById(r0.getDropDownAnchor());
        this.mDropDownAnchor = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new LKS(this, 0));
        }
        updateViewsVisibility(this.mIconifiedByDefault);
        updateQueryHint();
    }

    private Intent createIntent(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent A0A = 4YU.A0A(str);
        A0A.addFlags(268435456);
        if (uri != null) {
            A0A.setData(uri);
        }
        A0A.putExtra("user_query", this.mUserQuery);
        if (str3 != null) {
            A0A.putExtra("query", str3);
        }
        if (str2 != null) {
            A0A.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.mAppSearchData;
        if (bundle != null) {
            A0A.putExtra("app_data", bundle);
        }
        if (i != 0) {
            A0A.putExtra("action_key", i);
            A0A.putExtra("action_msg", str4);
        }
        A0A.setComponent(this.mSearchable.getSearchActivity());
        return A0A;
    }

    private Intent createIntentFromSuggestion(Cursor cursor, int i, String str) {
        int i2;
        try {
            String A01 = ViewOnClickListenerC3007Jg0.A01(cursor, cursor.getColumnIndex("suggest_intent_action"));
            if (A01 == null) {
                A01 = this.mSearchable.getSuggestIntentAction();
            }
            if (A01 == null) {
                A01 = "android.intent.action.SEARCH";
            }
            String A012 = ViewOnClickListenerC3007Jg0.A01(cursor, cursor.getColumnIndex("suggest_intent_data"));
            if (A012 == null) {
                A012 = this.mSearchable.getSuggestIntentData();
            }
            if (A012 != null) {
                String A013 = ViewOnClickListenerC3007Jg0.A01(cursor, cursor.getColumnIndex("suggest_intent_data_id"));
                if (A013 != null) {
                    A012 = 0Pz.A0j(A012, "/", Uri.encode(A013));
                }
            }
            return createIntent(A01, A012 == null ? null : Uri.parse(A012), ViewOnClickListenerC3007Jg0.A01(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), ViewOnClickListenerC3007Jg0.A01(cursor, cursor.getColumnIndex("suggest_intent_query")), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w(LOG_TAG, 0Pz.A0d("Search suggestions cursor at row ", " returned exception.", i2), e);
            return null;
        }
    }

    private Intent createVoiceAppSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent A0A = 4YU.A0A("android.intent.action.SEARCH");
        A0A.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, A0A, 1107296256);
        Bundle A05 = 1BK.A05();
        Bundle bundle = this.mAppSearchData;
        if (bundle != null) {
            A05.putParcelable("app_data", bundle);
        }
        Intent intent2 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent2.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent2.putExtra("android.speech.extra.PROMPT", string2);
        intent2.putExtra("android.speech.extra.LANGUAGE", string3);
        intent2.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", A05);
        return intent2;
    }

    private Intent createVoiceWebSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void dismissSuggestions() {
        this.mSearchSrcTextView.dismissDropDown();
    }

    private void getChildBoundsWithinSearchView(View view, Rect rect) {
        view.getLocationInWindow(this.mTemp);
        getLocationInWindow(this.mTemp2);
        int[] iArr = this.mTemp;
        int i = iArr[1];
        int[] iArr2 = this.mTemp2;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    private CharSequence getDecoratedHint(CharSequence charSequence) {
        if (!this.mIconifiedByDefault || this.mSearchHintIcon == null) {
            return charSequence;
        }
        int textSize = (int) (this.mSearchSrcTextView.getTextSize() * 1.25d);
        this.mSearchHintIcon.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.mSearchHintIcon), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private int getPreferredHeight() {
        return GOo.A0A(this).getDimensionPixelSize(2132279303);
    }

    private int getPreferredWidth() {
        return GOo.A0A(this).getDimensionPixelSize(2132279319);
    }

    private boolean hasVoiceSearch() {
        Intent intent;
        SearchableInfo searchableInfo = this.mSearchable;
        boolean z = false;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            if (this.mSearchable.getVoiceSearchLaunchWebSearch()) {
                intent = this.mVoiceWebSearchIntent;
            } else if (this.mSearchable.getVoiceSearchLaunchRecognizer()) {
                intent = this.mVoiceAppSearchIntent;
            }
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                z = true;
            }
        }
        return z;
    }

    public static boolean isLandscapeMode(Context context) {
        return AnonymousClass001.A1Q(4YU.A0B(context).orientation, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r301.mIconified != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean isSubmitAreaEnabled() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.mSubmitButtonEnabled
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L12
            r0 = r301
            boolean r0 = r0.mVoiceButtonEnabled
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1d
        L12:
            r0 = r301
            boolean r0 = r0.mIconified
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L1f
        L1d:
            r0 = 0
            r302 = r0
        L1f:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.isSubmitAreaEnabled():boolean");
    }

    private void launchIntent(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e(LOG_TAG, AnonymousClass001.A0Z(intent, "Failed launch activity: ", AnonymousClass001.A0k()), e);
            }
        }
    }

    private boolean launchSuggestion(int i, int i2, String str) {
        Cursor cursor = this.mSuggestionsAdapter.A02;
        if (cursor == null || !cursor.moveToPosition(i)) {
            return false;
        }
        launchIntent(createIntentFromSuggestion(cursor, i2, str));
        return true;
    }

    private void postUpdateFocusedState() {
        post(this.mUpdateDrawableStateRunnable);
    }

    private void rewriteQueryFromSuggestion(int i) {
        CharSequence AIB;
        Editable text = this.mSearchSrcTextView.getText();
        Cursor cursor = this.mSuggestionsAdapter.A02;
        if (cursor != null) {
            if (!cursor.moveToPosition(i) || (AIB = this.mSuggestionsAdapter.AIB(cursor)) == null) {
                setQuery(text);
            } else {
                setQuery(AIB);
            }
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.mSearchSrcTextView.setText(charSequence);
        this.mSearchSrcTextView.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private void updateCloseButton() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        int i = 0;
        if (!z2 && (!this.mIconifiedByDefault || this.mExpandedInActionView)) {
            z = false;
        }
        ImageView imageView = this.mCloseButton;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.mCloseButton.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? View.ENABLED_STATE_SET : View.EMPTY_STATE_SET);
        }
    }

    private void updateQueryHint() {
        CharSequence queryHint = getQueryHint();
        DLW dlw = this.mSearchSrcTextView;
        if (queryHint == null) {
            queryHint = "";
        }
        dlw.setHint(getDecoratedHint(queryHint));
    }

    private void updateSearchAutoComplete() {
        this.mSearchSrcTextView.setThreshold(this.mSearchable.getSuggestThreshold());
        this.mSearchSrcTextView.setImeOptions(this.mSearchable.getImeOptions());
        int inputType = this.mSearchable.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.mSearchable.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | Constants.LOAD_RESULT_WITH_VDEX_ODEX;
            }
        }
        this.mSearchSrcTextView.setInputType(inputType);
        JYX jyx = this.mSuggestionsAdapter;
        if (jyx != null) {
            jyx.AEY((Cursor) null);
        }
        if (this.mSearchable.getSuggestAuthority() != null) {
            ViewOnClickListenerC3007Jg0 viewOnClickListenerC3007Jg0 = new ViewOnClickListenerC3007Jg0(this.mSearchable, getContext(), this, this.mOutsideDrawablesCache);
            this.mSuggestionsAdapter = viewOnClickListenerC3007Jg0;
            this.mSearchSrcTextView.setAdapter(viewOnClickListenerC3007Jg0);
            ViewOnClickListenerC3007Jg0 viewOnClickListenerC3007Jg02 = (ViewOnClickListenerC3007Jg0) this.mSuggestionsAdapter;
            if (this.mQueryRefinement) {
                i = 2;
            }
            viewOnClickListenerC3007Jg02.A03 = i;
        }
    }

    private void updateSubmitArea() {
        this.mSubmitArea.setVisibility((isSubmitAreaEnabled() && (this.mGoButton.getVisibility() == 0 || this.mVoiceButton.getVisibility() == 0)) ? 0 : 8);
    }

    private void updateSubmitButton(boolean z) {
        this.mGoButton.setVisibility((this.mSubmitButtonEnabled && isSubmitAreaEnabled() && hasFocus() && (z || !this.mVoiceButtonEnabled)) ? 0 : 8);
    }

    private void updateViewsVisibility(boolean z) {
        this.mIconified = z;
        int i = 0;
        int A00 = DKG.A00(z ? 1 : 0);
        boolean A1V = JQx.A1V(this.mSearchSrcTextView.getText());
        this.mSearchButton.setVisibility(A00);
        updateSubmitButton(A1V);
        this.mSearchEditFrame.setVisibility(GOp.A01(z ? 1 : 0));
        if (this.mCollapsedIcon.getDrawable() == null || this.mIconifiedByDefault) {
            i = 8;
        }
        this.mCollapsedIcon.setVisibility(i);
        updateCloseButton();
        updateVoiceButton(!A1V);
        updateSubmitArea();
    }

    private void updateVoiceButton(boolean z) {
        int i = 8;
        if (this.mVoiceButtonEnabled && !this.mIconified && z) {
            this.mGoButton.setVisibility(8);
            i = 0;
        }
        this.mVoiceButton.setVisibility(i);
    }

    public void adjustDropDownSizeAndPosition() {
        if (this.mDropDownAnchor.getWidth() > 1) {
            Resources A0A = GOo.A0A(this);
            int paddingLeft = this.mSearchPlate.getPaddingLeft();
            Rect A0C = DKC.A0C();
            boolean A1V = 4YV.A1V(getLayoutDirection(), 1);
            int dimensionPixelSize = this.mIconifiedByDefault ? A0A.getDimensionPixelSize(2132279312) + A0A.getDimensionPixelSize(R.dimen.mapbox_eight_dp) : 0;
            this.mSearchSrcTextView.getDropDownBackground().getPadding(A0C);
            int i = A0C.left;
            int i2 = -i;
            if (!A1V) {
                i2 = paddingLeft - (i + dimensionPixelSize);
            }
            this.mSearchSrcTextView.setDropDownHorizontalOffset(i2);
            this.mSearchSrcTextView.setDropDownWidth((((this.mDropDownAnchor.getWidth() + A0C.left) + A0C.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.mClearingFocus = true;
        super.clearFocus();
        this.mSearchSrcTextView.clearFocus();
        this.mSearchSrcTextView.A01(false);
        this.mClearingFocus = false;
    }

    public void forceSuggestionQuery() {
        if (Build.VERSION.SDK_INT >= 29) {
            Kuz.A00(this.mSearchSrcTextView);
            return;
        }
        Kzx kzx = PRE_API_29_HIDDEN_METHOD_INVOKER;
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        Kzx.A00();
        Method method = kzx.A01;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        SearchAutoComplete searchAutoComplete2 = this.mSearchSrcTextView;
        Kzx.A00();
        Method method2 = kzx.A00;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public int getImeOptions() {
        return this.mSearchSrcTextView.getImeOptions();
    }

    public int getInputType() {
        return this.mSearchSrcTextView.getInputType();
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public CharSequence getQuery() {
        return this.mSearchSrcTextView.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.mQueryHint;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.mSearchable;
            if (searchableInfo == null || searchableInfo.getHintId() == 0) {
                return this.mDefaultQueryHint;
            }
            charSequence = getContext().getText(this.mSearchable.getHintId());
        }
        return charSequence;
    }

    public int getSuggestionCommitIconResId() {
        return this.mSuggestionCommitIconResId;
    }

    public int getSuggestionRowLayout() {
        return this.mSuggestionRowLayout;
    }

    public JYX getSuggestionsAdapter() {
        return this.mSuggestionsAdapter;
    }

    public boolean isIconfiedByDefault() {
        return this.mIconifiedByDefault;
    }

    public boolean isIconified() {
        return this.mIconified;
    }

    public boolean isQueryRefinementEnabled() {
        return this.mQueryRefinement;
    }

    public boolean isSubmitButtonEnabled() {
        return this.mSubmitButtonEnabled;
    }

    public void launchQuerySearch(int i, String str, String str2) {
        getContext().startActivity(createIntent("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    @Override // X.MHi
    public void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        updateViewsVisibility(true);
        this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions);
        this.mExpandedInActionView = false;
    }

    @Override // X.MHi
    public void onActionViewExpanded() {
        if (this.mExpandedInActionView) {
            return;
        }
        this.mExpandedInActionView = true;
        int imeOptions = this.mSearchSrcTextView.getImeOptions();
        this.mCollapsedImeOptions = imeOptions;
        this.mSearchSrcTextView.setImeOptions(imeOptions | 33554432);
        this.mSearchSrcTextView.setText("");
        onSearchClicked();
    }

    public void onCloseClicked() {
        if (!TextUtils.isEmpty(this.mSearchSrcTextView.getText())) {
            this.mSearchSrcTextView.setText("");
            this.mSearchSrcTextView.requestFocus();
            this.mSearchSrcTextView.A01(true);
        } else if (this.mIconifiedByDefault) {
            MDv mDv = this.mOnCloseListener;
            if (mDv != null) {
                mDv.BpK();
            }
            clearFocus();
            updateViewsVisibility(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(333466634);
        removeCallbacks(this.mUpdateDrawableStateRunnable);
        post(this.mReleaseCursorRunnable);
        super.onDetachedFromWindow();
        0FI.A0C(512637819, A06);
    }

    public boolean onItemClicked(int i, int i2, String str) {
        launchSuggestion(i, 0, null);
        this.mSearchSrcTextView.A01(false);
        dismissSuggestions();
        return true;
    }

    public boolean onItemSelected(int i) {
        rewriteQueryFromSuggestion(i);
        return true;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            getChildBoundsWithinSearchView(this.mSearchSrcTextView, this.mSearchSrcTextViewBounds);
            Rect rect = this.mSearchSrtTextViewBoundsExpanded;
            Rect rect2 = this.mSearchSrcTextViewBounds;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            JXX jxx = this.mTouchDelegate;
            Rect rect3 = this.mSearchSrtTextViewBoundsExpanded;
            Rect rect4 = this.mSearchSrcTextViewBounds;
            if (jxx == null) {
                TouchDelegate jxx2 = new JXX(rect3, rect4, this.mSearchSrcTextView);
                this.mTouchDelegate = jxx2;
                setTouchDelegate(jxx2);
            } else {
                jxx.A04.set(rect3);
                Rect rect5 = jxx.A03;
                rect5.set(rect3);
                int i5 = -jxx.A01;
                rect5.inset(i5, i5);
                jxx.A02.set(rect4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r304 > 0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.mIconified
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L6a
            r0 = r302
            int r0 = android.view.View.MeasureSpec.getMode(r0)
            r304 = r0
            r0 = r302
            int r0 = android.view.View.MeasureSpec.getSize(r0)
            r305 = r0
            r0 = -1
            r1 = -1
            int r0 = r0 << r1
            r306 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            r307 = r0
            r0 = r304
            r1 = r306
            if (r0 == r1) goto L95
            r0 = r304
            if (r0 == 0) goto L81
            r0 = r304
            r1 = r307
            if (r0 != r1) goto L3f
            r0 = r301
            int r0 = r0.mMaxWidth
            r304 = r0
            r0 = r304
            if (r0 <= 0) goto L3f
        L37:
            r0 = r304
            r1 = r305
            int r0 = java.lang.Math.min(r0, r1)
            r305 = r0
        L3f:
            r0 = r303
            int r0 = android.view.View.MeasureSpec.getMode(r0)
            r304 = r0
            r0 = r303
            int r0 = android.view.View.MeasureSpec.getSize(r0)
            r308 = r0
            r0 = r304
            r1 = r306
            if (r0 == r1) goto L71
            r0 = r304
            if (r0 != 0) goto L5a
            r0 = r301
            int r0 = r0.getPreferredHeight()
            r308 = r0
        L5a:
            r0 = r305
            r1 = r307
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r302 = r0
            r0 = r308
            r1 = r307
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r303 = r0
        L6a:
            r0 = r301
            r1 = r302
            r2 = r303
            super.onMeasure(r1, r2)
            return
        L71:
            r0 = r301
            int r0 = r0.getPreferredHeight()
            r304 = r0
            r0 = r304
            r1 = r308
            int r0 = java.lang.Math.min(r0, r1)
            r308 = r0
            goto L5a
        L81:
            r0 = r301
            int r0 = r0.mMaxWidth
            r305 = r0
            r0 = r305
            if (r0 > 0) goto L3f
            r0 = r301
            int r0 = r0.getPreferredWidth()
            r305 = r0
            goto L3f
        L95:
            r0 = r301
            int r0 = r0.mMaxWidth
            r304 = r0
            r0 = r304
            if (r0 > 0) goto L37
            r0 = r301
            int r0 = r0.getPreferredWidth()
            r304 = r0
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    public void onQueryRefine(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(((AbsSavedState) savedState).A00);
        updateViewsVisibility(savedState.A00);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, androidx.appcompat.widget.SearchView$SavedState] */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        absSavedState.A00 = this.mIconified;
        return absSavedState;
    }

    public void onSearchClicked() {
        updateViewsVisibility(false);
        this.mSearchSrcTextView.requestFocus();
        this.mSearchSrcTextView.A01(true);
        View.OnClickListener onClickListener = this.mOnSearchClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void onSubmitQuery() {
        Editable text = this.mSearchSrcTextView.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        MHn mHn = this.mOnQueryChangeListener;
        if (mHn == null || !mHn.onQueryTextSubmit(text.toString())) {
            if (this.mSearchable != null) {
                launchQuerySearch(0, null, text.toString());
            }
            this.mSearchSrcTextView.A01(false);
            dismissSuggestions();
        }
    }

    public boolean onSuggestionsKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (this.mSearchable == null || this.mSuggestionsAdapter == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
            return false;
        }
        if (i == 66 || i == 84 || i == 61) {
            return onItemClicked(this.mSearchSrcTextView.getListSelection(), 0, null);
        }
        if (i == 21) {
            i2 = 0;
        } else {
            if (i != 22) {
                if (i != 19) {
                    return false;
                }
                this.mSearchSrcTextView.getListSelection();
                return false;
            }
            i2 = this.mSearchSrcTextView.length();
        }
        this.mSearchSrcTextView.setSelection(i2);
        this.mSearchSrcTextView.setListSelection(0);
        this.mSearchSrcTextView.clearListSelection();
        this.mSearchSrcTextView.A00();
        return true;
    }

    public void onTextChanged(CharSequence charSequence) {
        Editable text = this.mSearchSrcTextView.getText();
        this.mUserQuery = text;
        boolean A1V = JQx.A1V(text);
        updateSubmitButton(A1V);
        updateVoiceButton(!A1V);
        updateCloseButton();
        updateSubmitArea();
        if (this.mOnQueryChangeListener != null && !TextUtils.equals(charSequence, this.mOldQueryText)) {
            this.mOnQueryChangeListener.onQueryTextChange(charSequence.toString());
        }
        this.mOldQueryText = charSequence.toString();
    }

    public void onTextFocusChanged() {
        updateViewsVisibility(this.mIconified);
        postUpdateFocusedState();
        if (this.mSearchSrcTextView.hasFocus()) {
            forceSuggestionQuery();
        }
    }

    public void onVoiceClicked() {
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(createVoiceWebSearchIntent(this.mVoiceWebSearchIntent, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(createVoiceAppSearchIntent(this.mVoiceAppSearchIntent, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w(LOG_TAG, "Could not find voice search activity");
            }
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        int A06 = 0FI.A06(-747092472);
        super.onWindowFocusChanged(z);
        postUpdateFocusedState();
        0FI.A0C(1559626855, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.mClearingFocus || !isFocusable()) {
            return false;
        }
        if (this.mIconified) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.mSearchSrcTextView.requestFocus(i, rect);
        if (requestFocus) {
            updateViewsVisibility(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.mAppSearchData = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            onCloseClicked();
        } else {
            onSearchClicked();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.mIconifiedByDefault != z) {
            this.mIconifiedByDefault = z;
            updateViewsVisibility(z);
            updateQueryHint();
        }
    }

    public void setImeOptions(int i) {
        this.mSearchSrcTextView.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.mSearchSrcTextView.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setOnCloseListener(MDv mDv) {
        this.mOnCloseListener = mDv;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.mOnQueryTextFocusChangeListener = onFocusChangeListener;
    }

    public void setOnQueryTextListener(MHn mHn) {
        this.mOnQueryChangeListener = mHn;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.mOnSearchClickListener = onClickListener;
    }

    public void setOnSuggestionListener(MB6 mb6) {
        this.mOnSuggestionListener = mb6;
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.mSearchSrcTextView.setText(charSequence);
        if (charSequence != null) {
            DLW dlw = this.mSearchSrcTextView;
            dlw.setSelection(dlw.length());
            this.mUserQuery = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        onSubmitQuery();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.mQueryHint = charSequence;
        updateQueryHint();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.mQueryRefinement = z;
        JYX jyx = this.mSuggestionsAdapter;
        if (jyx instanceof ViewOnClickListenerC3007Jg0) {
            ViewOnClickListenerC3007Jg0 viewOnClickListenerC3007Jg0 = (ViewOnClickListenerC3007Jg0) jyx;
            int i = 1;
            if (z) {
                i = 2;
            }
            viewOnClickListenerC3007Jg0.A03 = i;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.mSearchable = searchableInfo;
        if (searchableInfo != null) {
            updateSearchAutoComplete();
            updateQueryHint();
        }
        boolean hasVoiceSearch = hasVoiceSearch();
        this.mVoiceButtonEnabled = hasVoiceSearch;
        if (hasVoiceSearch) {
            this.mSearchSrcTextView.setPrivateImeOptions(IME_OPTION_NO_MICROPHONE);
        }
        updateViewsVisibility(this.mIconified);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.mSubmitButtonEnabled = z;
        updateViewsVisibility(this.mIconified);
    }

    public void setSuggestionsAdapter(JYX jyx) {
        this.mSuggestionsAdapter = jyx;
        this.mSearchSrcTextView.setAdapter(jyx);
    }

    public void updateFocusedState() {
        int[] iArr = this.mSearchSrcTextView.hasFocus() ? View.FOCUSED_STATE_SET : View.EMPTY_STATE_SET;
        Drawable background = this.mSearchPlate.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.mSubmitArea.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }
}
