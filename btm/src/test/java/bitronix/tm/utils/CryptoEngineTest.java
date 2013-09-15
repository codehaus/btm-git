/*
 * Bitronix Transaction Manager
 *
 * Copyright (c) 2010, Bitronix Software.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA 02110-1301 USA
 */
package bitronix.tm.utils;

import junit.framework.TestCase;

/**
 *
 * @author lorban
 */
public class CryptoEngineTest extends TestCase {

    public void testCryptDES() throws Exception {
    	String textToCrypt = "java and bitronix will rule the earth";

    	String cypherText = CryptoEngine.crypt("DES", textToCrypt);
        String decryptedText = CryptoEngine.decrypt("DES", cypherText);

        assertEquals(textToCrypt, decryptedText);
    }

    public void testCrypt3DES() throws Exception {
    	String textToCrypt = "java";

    	String cypherText = CryptoEngine.crypt("DESede", textToCrypt);
        String decryptedText = CryptoEngine.decrypt("DESede", cypherText);

        assertEquals(textToCrypt, decryptedText);
    }

}
