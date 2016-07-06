/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

/**
 * Class Max15NumericTextCls.The Max15NumericText atomic simple
 * data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class Max15NumericTextCls extends biz.c24.io.api.data.GenericStringDataType {

    /**
     * Field instance.
     */
    protected static volatile Max15NumericTextCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected Max15NumericTextCls() {
    }

    /**
     * Gets the singleton instance of this type.
     * 
     * @return The type, or its supertype if present.
     */
    public static biz.c24.io.api.data.DataType getInstance() {
        if (!initialized)
        {
            synchronized (biz.c24.io.api.data.ComplexDataType.class)
            {
                if (instance == null)
                {
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Max15NumericTextCls();
                    instance.init();
                    initialized = true;
                }
            }
        }
        return instance;
    }

    /**
     * Called internally to initialize this type.
     */
    protected void init() {
        setName("Max15NumericText");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance());
        setPatternType(biz.c24.io.api.data.PatternTypeEnum.SCHEMA);
        setPatternMatch("[0-9]{1,15}");
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
