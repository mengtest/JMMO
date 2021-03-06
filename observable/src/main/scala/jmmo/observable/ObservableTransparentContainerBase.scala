package jmmo.observable

import jmmo.observable.impl.{TransparentContainerGen, TransparentContainer}

/**
 * User: Tomas
 * Date: 02.09.13
 * Time: 9:40
 */
trait ObservableTransparentContainerBase[A <: Observable] extends ObservableContainerBase[A] with TransparentContainerGen[A]
