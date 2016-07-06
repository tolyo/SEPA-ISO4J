/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

/**
 * Class ActiveOrHistoricCurrencyCodeCls.The
 * ActiveOrHistoricCurrencyCode atomic simple data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class ActiveOrHistoricCurrencyCodeCls extends biz.c24.io.api.data.GenericStringDataType {

    /**
     * Field instance.
     */
    protected static volatile ActiveOrHistoricCurrencyCodeCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected ActiveOrHistoricCurrencyCodeCls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyCodeCls();
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
        setName("ActiveOrHistoricCurrencyCode");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance());
        setPatternType(biz.c24.io.api.data.PatternTypeEnum.SCHEMA);
        setPatternMatch("[A-Z]{3,3}");
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
