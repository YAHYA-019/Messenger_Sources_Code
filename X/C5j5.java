package X;

/* renamed from: X.5j5, reason: invalid class name */
/* loaded from: 5j5.class */
public interface C5j5 {
    public static final C5j5 A00;
    public static final C5j5 A01;

    static {
        final boolean z = true;
        A01 = new C5j5(z) { // from class: X.5j6
            public final boolean A00;

            {
                this.A00 = z;
            }

            @Override // X.C5j5
            public String ALg(CharSequence charSequence) {
                return ALh(charSequence, -1);
            }

            @Override // X.C5j5
            public String ALh(CharSequence charSequence, long j) {
                0fH.A0h(Long.valueOf(j), "VaultContextNotVaulted", "Feature %d is un-vaulting sensitive data");
                if (this.A00 && charSequence.length() >= 7) {
                    int i = 0;
                    while (charSequence.charAt(i) == "\ue045\ue0bd\ue166#\ue045\ue0bd\ue166".charAt(i)) {
                        i++;
                        if (i >= 7) {
                            break;
                        }
                    }
                }
                return charSequence.toString();
            }
        };
        final boolean z2 = false;
        A00 = new C5j5(z2) { // from class: X.5j6
            public final boolean A00;

            {
                this.A00 = z2;
            }

            @Override // X.C5j5
            public String ALg(CharSequence charSequence) {
                return ALh(charSequence, -1);
            }

            @Override // X.C5j5
            public String ALh(CharSequence charSequence, long j) {
                0fH.A0h(Long.valueOf(j), "VaultContextNotVaulted", "Feature %d is un-vaulting sensitive data");
                if (this.A00 && charSequence.length() >= 7) {
                    int i = 0;
                    while (charSequence.charAt(i) == "\ue045\ue0bd\ue166#\ue045\ue0bd\ue166".charAt(i)) {
                        i++;
                        if (i >= 7) {
                            break;
                        }
                    }
                }
                return charSequence.toString();
            }
        };
    }

    String ALg(CharSequence charSequence);

    String ALh(CharSequence charSequence, long j);
}
