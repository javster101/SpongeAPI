/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.spongepowered.api.component.attribute;

/**
 * An entity that contains a health attribute.
 */
public interface Damageable {

    /**
     * Subtracts from the health by the given amount.
     *
     * @param amount The damage amount
     */
    void damage(double amount);
    
    /**
     * Adds to the health by the given amount.
     * 
     * @param amount The healing amount
     */
    void heal(double amount);

    /**
     * Returns the health amount.
     *
     * <p>The range of the health depends on the object on which this
     * method is defined. For players in Minecraft, the nominal range is
     * between 0 and 20, inclusive, but the range can be adjusted.</p>
     *
     * <p>Convention dictates that health does not follow below 0 but this
     * convention may be broken.</p>
     *
     * @return Health value
     */
    double getHealth();

    /**
     * Set the health amount.
     *
     * <p>The range of the health depends on the object on which this
     * method is defined. For players in Minecraft, the nominal range is
     * between 0 and 20, inclusive, but the range can be adjusted.</p>
     *
     * <p>Convention dictates that health does not follow below 0 but this
     * convention may be broken.</p>
     *
     * @param health The health to set to
     */
    void setHealth(double health);

}
