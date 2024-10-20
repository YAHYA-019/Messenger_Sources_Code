package X;

import android.text.InputFilter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.cell.text.formatter.TextFormatter;
import com.facebookpay.form.cell.text.util.CvvTextFieldHandler;
import com.fbpay.theme.FBPayIcon;
import com.google.common.collect.ImmutableList;

/* loaded from: JxE.class */
public class JxE extends L93 {
    public ImmutableList A00;
    public boolean A01;
    public final MediatorLiveData A02;
    public final MediatorLiveData A03;
    public final MutableLiveData A04;
    public final MutableLiveData A05;
    public final MutableLiveData A06;
    public final MutableLiveData A07;
    public final MutableLiveData A08;
    public final MutableLiveData A09;
    public final MutableLiveData A0A;
    public final Observer A0B;
    public final Observer A0C;
    public final TextFormatter A0D;
    public final CvvTextFieldHandler A0E;
    public final FBPayIcon A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final MutableLiveData A0I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v28, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    public JxE(FormCellLoggingEvents formCellLoggingEvents, TextFormatter textFormatter, CvvTextFieldHandler cvvTextFieldHandler, FBPayIcon fBPayIcon, ImmutableList immutableList, Integer num, String str, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(formCellLoggingEvents, i, z, z2);
        11T.A0F(num, 12);
        this.A00 = immutableList;
        this.A0E = cvvTextFieldHandler;
        this.A0C = LR9.A01(this, 5);
        this.A0B = LR9.A01(this, 4);
        MutableLiveData A0a = JQx.A0a();
        this.A0I = A0a;
        this.A09 = JQx.A0a();
        this.A06 = JQx.A0a();
        MutableLiveData A0a2 = JQx.A0a();
        this.A05 = A0a2;
        this.A0A = JQx.A0a();
        this.A02 = new MediatorLiveData();
        this.A03 = new MediatorLiveData();
        this.A07 = new LiveData(null);
        this.A04 = JQx.A0a();
        this.A08 = JQx.A0a();
        MediatorLiveData mediatorLiveData = super.A04;
        mediatorLiveData.setValue(str);
        super.A03.put(i, str == null ? "" : str);
        A0a2.setValue(A00(this));
        MediatorLiveData mediatorLiveData2 = this.A02;
        mediatorLiveData2.addSource(this.A09, this.A0C);
        mediatorLiveData2.addSource(mediatorLiveData, this.A0B);
        this.A0F = fBPayIcon;
        this.A0H = z3;
        this.A0D = textFormatter;
        if (textFormatter != null) {
            A0a.setValue(textFormatter);
        }
        this.A0G = z4;
    }

    public static final InputFilter.LengthFilter A00(JxE jxE) {
        int i;
        1Du it = jxE.A00.iterator();
        int i2 = (-1) >>> 1;
        while (true) {
            i = i2;
            if (!it.hasNext()) {
                break;
            }
            i2 = Math.min(i, ((QyN) it.next()).A00());
        }
        1Du it2 = jxE.A00.iterator();
        while (it2.hasNext() && !(it2.next() instanceof QXJ)) {
        }
        return new InputFilter.LengthFilter(i);
    }

    @Override // X.L93
    public boolean A0F() {
        if (!super.A08 || !super.A07) {
            return true;
        }
        String str = (String) super.A04.getValue();
        1Du it = this.A00.iterator();
        while (it.hasNext()) {
            if (!((QyN) it.next()).A02(str)) {
                return false;
            }
        }
        return true;
    }

    public final void A0G() {
        this.A0A.setValue(new Object());
    }
}
