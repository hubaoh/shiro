/*
 * Copyright (C) 2005 Jeremy Haile
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General
 * Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the
 *
 * Free Software Foundation, Inc.
 * 59 Temple Place, Suite 330
 * Boston, MA 02111-1307
 * USA
 *
 * Or, you may view it online at
 * http://www.opensource.org/licenses/lgpl-license.php
 */

package org.jsecurity.context;

import org.jsecurity.JSecurityException;

/**
 * <p>Throw when there is an error loading the {@link SecurityContext}.
 *
 * <p>The most common cause for this exception to be thrown is if the JSecurity
 * implementation is not in the classpath and the <code>jsecurity.properties</code>
 * file cannot be loaded, although it could be thrown when the security context
 * cannot be loaded for any reason.</p>
 *
 * @since 1.0
 * @author Jeremy Haile
 */
public class SecurityContextException extends JSecurityException {

    /**
     * Creates a new SecurityContextException.
     */
    public SecurityContextException() {
        super();
    }

    /**
     * Constructs a new SecurityContextException.
     * @param message the reason for the exception
     */
    public SecurityContextException( String message ) {
        super( message );
    }

    /**
     * Constructs a new SecurityContextException.
     * @param cause the underlying Throwable that caused this exception to be thrown.
     */
    public SecurityContextException( Throwable cause ) {
        super( cause );
    }

    /**
     * Constructs a new SecurityContextException.
     * @param message the reason for the exception
     * @param cause the underlying Throwable that caused this exception to be thrown.
     */
    public SecurityContextException( String message, Throwable cause ) {
        super( message, cause );
    }
}