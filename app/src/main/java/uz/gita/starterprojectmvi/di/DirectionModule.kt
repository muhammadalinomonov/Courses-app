package uz.gita.starterprojectmvi.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import uz.gita.starterprojectmvi.presentation.screen.auth.login.LoginDirection
import uz.gita.starterprojectmvi.presentation.screen.auth.login.LoginDirectionImpl
import uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterDirection
import uz.gita.starterprojectmvi.presentation.screen.auth.register.RegisterDirectionImpl
import uz.gita.starterprojectmvi.presentation.screen.details.DetailsContract
import uz.gita.starterprojectmvi.presentation.screen.details.DetailsDirections
import uz.gita.starterprojectmvi.presentation.screen.home.HomeDirection
import uz.gita.starterprojectmvi.presentation.screen.home.HomeDirectionImpl
import uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1Contract
import uz.gita.starterprojectmvi.presentation.screen.home.page1.Page1DirectionImpl
import uz.gita.starterprojectmvi.presentation.screen.home.page2.Page2Direction
import uz.gita.starterprojectmvi.presentation.screen.home.page2.Page2DirectionImpl
import uz.gita.starterprojectmvi.presentation.screen.home.page3.Page3Direction
import uz.gita.starterprojectmvi.presentation.screen.home.page3.Page3DirectionImpl
import uz.gita.starterprojectmvi.presentation.screen.payment.PaymentContract
import uz.gita.starterprojectmvi.presentation.screen.payment.PaymentDirectionImpl
import uz.gita.starterprojectmvi.presentation.screen.search.SearchContract
import uz.gita.starterprojectmvi.presentation.screen.search.SearchDirectionsImpl
import uz.gita.starterprojectmvi.presentation.screen.yourcourses.YourCoursesDirection
import uz.gita.starterprojectmvi.presentation.screen.yourcourses.YourCoursesDirectionImpl

@Module
@InstallIn(ViewModelComponent::class)
interface DirectionModule {
    @Binds
    fun bindHomeDirection(impl: HomeDirectionImpl): HomeDirection

    @Binds
    fun bindPage1Direction(impl: Page1DirectionImpl): Page1Contract.Page1Direction

    @Binds
    fun bindPage2Direction(impl: Page2DirectionImpl): Page2Direction

    @Binds
    fun bindPage3Direction(impl: Page3DirectionImpl): Page3Direction

    @Binds
    fun yourCoursesDirection(impl: YourCoursesDirectionImpl): YourCoursesDirection


    @Binds
    fun bindLoginDirection(impl: LoginDirectionImpl): LoginDirection

    @Binds
    fun bindRegisterDirection(impl: RegisterDirectionImpl): RegisterDirection

    @Binds
    fun bindSearchDirection(impl: SearchDirectionsImpl): SearchContract.Directions

    @Binds
    fun bindDetailsDirection(impl: DetailsDirections): DetailsContract.Directions

    @Binds
    fun bindPaymentDirection(impl: PaymentDirectionImpl): PaymentContract.PaymentDirection
}