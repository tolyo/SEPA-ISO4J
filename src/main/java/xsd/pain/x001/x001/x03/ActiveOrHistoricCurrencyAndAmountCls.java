/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03;

/**
 * Class ActiveOrHistoricCurrencyAndAmountCls.The
 * ActiveOrHistoricCurrencyAndAmount complex data type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount
 */
public class ActiveOrHistoricCurrencyAndAmountCls extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile ActiveOrHistoricCurrencyAndAmountCls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected ActiveOrHistoricCurrencyAndAmountCls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmountCls();
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
        setName("ActiveOrHistoricCurrencyAndAmount");
        setModel(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance());
        setValidObjectClass(iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        setContentType((biz.c24.io.api.data.SimpleDataType) iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyAndAmount_SimpleTypeCls.getInstance());
        biz.c24.io.api.data.Attribute attribute = null;
        addAttrDecl(attribute = new biz.c24.io.api.data.Attribute("Ccy", 1, 1, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.ActiveOrHistoricCurrencyCodeCls.class, iso.std.iso.x20022.tech.xsd.pain.x001.x001.x03.Pain00100103DataModel.getInstance()));
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
