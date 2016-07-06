/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02;

/**
 * Class ImpliedCurrencyAndAmountCls.The ImpliedCurrencyAndAmount
 * atomic simple data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class ImpliedCurrencyAndAmountCls extends biz.c24.io.api.data.DecimalDataType {

    /**
     * Field instance.
     */
    protected static volatile ImpliedCurrencyAndAmountCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected ImpliedCurrencyAndAmountCls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.ImpliedCurrencyAndAmountCls();
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
        setName("ImpliedCurrencyAndAmount");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x052.x001.x02.Camt05200102DataModel.getInstance());
        setMaxFractionDigits(5);
        setMaxTotalDigits(18);
        setMinInclusive(new java.math.BigDecimal("0"));
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
