package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.reflect.Field;

/* renamed from: X.68f, reason: invalid class name */
/* loaded from: 68f.class */
public final class C68f extends 68S {
    public static final long serialVersionUID = 1;
    public final transient Field A00;
    public final C67y _annotated;
    public final boolean _skipNulls;

    public C68f(24S r302, C67y c67y, AnonymousClass687 anonymousClass687, C68e c68e, C24w c24w) {
        super(r302, anonymousClass687, c68e, c24w);
        this._annotated = c67y;
        this.A00 = c67y.A00;
        this._skipNulls = ((68S) this)._nullProvider == C68h.A01;
    }

    public C68f(C26G c26g, C68f c68f) {
        super(c26g, c68f);
        this._annotated = c68f._annotated;
        this.A00 = c68f.A00;
        this._skipNulls = c68f._skipNulls;
    }

    public C68f(C68f c68f) {
        super(c68f);
        C67y c67y = c68f._annotated;
        this._annotated = c67y;
        Field field = c67y.A00;
        if (field == null) {
            throw AnonymousClass001.A0L("Missing field (broken JDK (de)serialization?)");
        }
        this.A00 = field;
        this._skipNulls = c68f._skipNulls;
    }

    public C68f(JsonDeserializer jsonDeserializer, C42o c42o, C68f c68f) {
        super(jsonDeserializer, c42o, c68f);
        this._annotated = c68f._annotated;
        this.A00 = c68f.A00;
        this._skipNulls = c42o == C68h.A01;
    }

    public Object readResolve() {
        return new C68f(this);
    }
}
