/*
 * $Id$
 */

package iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02;

/**
 * Class Camt05300102DataModel.The camt.053.001.02 data model.
 * 
 * 
 * <br><strong>Produced by C24 Integration Objects
 * (http://www.c24.biz)</br>
 * 
 * 
 * @author C24 Integration Objects;
 * @version $Revision$ $Date$
 */
public class Camt05300102DataModel extends biz.c24.io.api.data.DataModel {

    /**
     * Field instance.
     */
    private static volatile Camt05300102DataModel instance;

    /**
     * Field initialized.
     */
    private static volatile boolean initialized;

    protected Camt05300102DataModel(boolean init) {
        if (init)
            init();
    }

    /**
     * Gets the singleton instance.
     * 
     * @return The instance.
     */
    public static iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel getInstance() {
        if (!initialized)
        {
            synchronized (biz.c24.io.api.data.ComplexDataType.class)
            {
                if (instance == null)
                {
                    instance = new iso.std.iso.x20022.tech.xsd.camt.x053.x001.x02.Camt05300102DataModel(false);
                    instance.init();
                    initialized = true;
                }
            }
        }
        return instance;
    }

    /**
     */
    private void init() {
        setName("camt.053.001.02");
        setTargetNamespace("urn:iso:std:iso:20022:tech:xsd:camt.053.001.02");
        setElementFormDefault(biz.c24.io.api.data.FormEnum.QUALIFIED);
        setAttributeFormDefault(biz.c24.io.api.data.FormEnum.UNQUALIFIED);
        setIdGeneratorMethodDefault(biz.c24.io.api.data.IDGeneratorMethodEnum.NATIVE);
        setSource(new biz.c24.io.api.presentation.XMLSource());
        setSink(new biz.c24.io.api.presentation.XMLSink());
    }

}
