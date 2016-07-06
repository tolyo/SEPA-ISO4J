/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

/**
 * Class CurrencyExchange5Cls.The CurrencyExchange5 complex data
 * type.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 * @see
 * iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyExchange5
 */
public class CurrencyExchange5Cls extends biz.c24.io.api.data.ComplexDataType {

    /**
     * Field instance.
     */
    protected static volatile CurrencyExchange5Cls instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected CurrencyExchange5Cls() {
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
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyExchange5Cls();
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
        setName("CurrencyExchange5");
        setModel(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance());
        setValidObjectClass(iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.CurrencyExchange5.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("SrcCcy", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyCodeCls.class, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("TrgtCcy", 0, 1, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyCodeCls.class, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("UnitCcy", 0, 1, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ActiveOrHistoricCurrencyCodeCls.class, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("XchgRate", 1, 1, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.BaseOneRateCls.class, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("CtrctId", 0, 1, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Max35TextCls.class, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance()));
        element.setIgnoredElement(false);
        addElementDecl(element = new biz.c24.io.api.data.Element("QtnDt", 0, 1, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.ISODateTimeCls.class, iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel.getInstance()));
        element.setIgnoredElement(false);
    }

    /**
     */
    private java.lang.Object readResolve() {
        return getInstance();
    }

}
