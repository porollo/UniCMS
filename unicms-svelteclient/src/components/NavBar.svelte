<svelte:head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</svelte:head>

<script>
    import {
        Navbar,
        NavbarToggler,
        NavbarBrand,
        Nav,
        NavItem,
        NavLink
    } from 'sveltestrap';

    let isOpen = false;

    function handleUpdate(event) {
        isOpen = event.detail.isOpen;
    }
</script>


<Navbar color="dark" dark expand="md">
    <NavbarBrand href="/">UniCMS</NavbarBrand>
    <NavbarToggler on:click={() => (isOpen = !isOpen)} />


    <Nav class="ml-auto" navbar>
        <NavItem>
            <NavLink href="/products">Products</NavLink>
        </NavItem>

        <NavItem>
            <NavLink href="/about">About</NavLink>
        </NavItem>

        <NavItem>
            <NavLink href="/contacts">Contacts</NavLink>
        </NavItem>

        <NavItem>
            <NavLink href="/register">Register</NavLink>
        </NavItem>

        <NavItem>
            <NavLink href="/login">Login</NavLink>
        </NavItem>

    </Nav>

</Navbar>